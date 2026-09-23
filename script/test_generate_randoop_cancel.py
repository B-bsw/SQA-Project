import tempfile
import unittest
from pathlib import Path
from unittest.mock import patch

import generate_randoop_tests as generator


class FakeRandoop:
    def __init__(self, command, cwd, mode):
        self.command = command
        self.cwd = Path(cwd)
        self.mode = mode
        self.returncode = 0 if mode == "success" else 1

    def communicate(self):
        output = self.cwd / "org" / "example" / "RegressionTest0.java"
        output.parent.mkdir(parents=True)
        output.write_text("class RegressionTest0 {}", encoding="utf-8")
        if self.mode == "cancel":
            raise KeyboardInterrupt
        return "output", ""

    def poll(self):
        return self.returncode


class CancelOutputTests(unittest.TestCase):
    def test_only_success_publishes_and_cancel_cleans_staging(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            info = {"project_name": "Codec_13", "fqcns": ["org.example.Codec"],
                    "primary_package": "org.example"}
            classes = root / "classes"
            classes.mkdir()
            jar = root / "randoop.jar"
            jar.write_bytes(b"jar")
            output = root / "TestCode" / "Codec_13_buggy"
            kwargs = dict(project_info=info, randoop_jar=jar, classes_dir=classes,
                          output_dir=output, time_limit=1, workspace_dir=root)

            def run(mode):
                with patch.object(generator, "collect_project_classpath_entries", return_value=[]), \
                     patch.object(generator.tempfile, "gettempdir", return_value=str(root)), \
                     patch.object(generator.subprocess, "Popen",
                                  side_effect=lambda command, cwd, **options: FakeRandoop(command, cwd, mode)):
                    return generator.run_randoop_for_project(**kwargs)

            success, _, files = run("failed")
            self.assertFalse(success)
            self.assertEqual(files, [])
            self.assertFalse(output.exists())
            self.assertEqual(list((root / "sqa_randoop").iterdir()), [])

            with self.assertRaises(KeyboardInterrupt):
                run("cancel")
            self.assertFalse(output.exists())
            self.assertEqual(list((root / "sqa_randoop").iterdir()), [])

            success, _, files = run("success")
            self.assertTrue(success)
            self.assertEqual(files, [str(Path("org/example/RegressionTest0.java"))])
            original = output / files[0]
            self.assertTrue(original.exists())

            run("failed")
            self.assertTrue(original.exists())
            with self.assertRaises(KeyboardInterrupt):
                run("cancel")
            self.assertTrue(original.exists())


if __name__ == "__main__":
    unittest.main()
