package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer;

public class MakeDeclaredNamesUniqueTest {
    private MakeDeclaredNamesUnique makeDeclaredNamesUnique;

    @Before
    public void setUp() {
        makeDeclaredNamesUnique = new MakeDeclaredNamesUnique();
    }

    @After
    public void tearDown() {
        makeDeclaredNamesUnique = null;
    }

    @Test
    public void testConstructorDefault() {
        assertNotNull(makeDeclaredNamesUnique);
    }

    @Test
    public void testConstructorWithRenamer() {
        Renamer renamer = new ContextualRenamer();
        MakeDeclaredNamesUnique unique = new MakeDeclaredNamesUnique(renamer);
        assertNotNull(unique);
    }

    @Test
    public void testGetContextualRenameInverter() {
        CompilerPass pass = MakeDeclaredNamesUnique.getContextualRenameInverter(new AbstractCompiler() {
            @Override
            public void reportCodeChange() {
            }
        });
        assertNotNull(pass);
    }

    @Test
    public void testContextualRenamerForChildScope() {
        ContextualRenamer parent = new ContextualRenamer();
        Renamer child = parent.forChildScope();
        assertNotNull(child);
        assertTrue(child instanceof ContextualRenamer);
    }

    @Test
    public void testContextualRenamerAddDeclaredNameGlobal() {
        ContextualRenamer renamer = new ContextualRenamer();
        renamer.addDeclaredName("testName");
        assertNull(renamer.getReplacementName("testName"));
    }

    @Test
    public void testContextualRenamerAddDeclaredNameLocalDuplicates() {
        ContextualRenamer parent = new ContextualRenamer();
        Renamer child1 = parent.forChildScope();
        Renamer child2 = parent.forChildScope();
        child1.addDeclaredName("dupName");
        child2.addDeclaredName("dupName");
        assertNull(child1.getReplacementName("dupName"));
        assertNull(child2.getReplacementName("dupName"));
    }

    @Test
    public void testContextualRenamerGetReplacementNameUnknown() {
        ContextualRenamer renamer = new ContextualRenamer();
        assertNull(renamer.getReplacementName("unknown"));
    }

    @Test
    public void testContextualRenamerStripConstIfReplaced() {
        ContextualRenamer renamer = new ContextualRenamer();
        assertEquals(false, renamer.stripConstIfReplaced());
    }

    @Test
    public void testContextualRenamerGetReplacementNameWithSeparator() {
        ContextualRenamer parent = new ContextualRenamer();
        Renamer child = parent.forChildScope();
        child.addDeclaredName("name$$0");
        String replacement = child.getReplacementName("name$$0");
        assertNull(replacement);
    }

    @Test
    public void testInlineRenamerAddDeclaredName() {
        Supplier<String> supplier = new Supplier<String>() {
            private int count = 0;
            @Override
            public String get() {
                return String.valueOf(count++);
            }
        };
        InlineRenamer renamer = new InlineRenamer(supplier, "x", false);
        renamer.addDeclaredName("a");
        assertNotNull(renamer.getReplacementName("a"));
    }

    @Test
    public void testInlineRenamerAddDeclaredNameEmpty() {
        Supplier<String> supplier = new Supplier<String>() {
            private int count = 0;
            @Override
            public String get() {
                return String.valueOf(count++);
            }
        };
        InlineRenamer renamer = new InlineRenamer(supplier, "x", false);
        renamer.addDeclaredName("");
        assertEquals("", renamer.getReplacementName(""));
    }

    @Test
    public void testInlineRenamerStripConstIfReplacedTrue() {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "1";
            }
        };
        InlineRenamer renamer = new InlineRenamer(supplier, "x", true);
        assertEquals(true, renamer.stripConstIfReplaced());
    }

    @Test
    public void testInlineRenamerStripConstIfReplacedFalse() {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "1";
            }
        };
        InlineRenamer renamer = new InlineRenamer(supplier, "x", false);
        assertEquals(false, renamer.stripConstIfReplaced());
    }

    @Test
    public void testInlineRenamerGetReplacementNameWithSeparator() {
        Supplier<String> supplier = new Supplier<String>() {
            private int count = 0;
            @Override
            public String get() {
                return String.valueOf(count++);
            }
        };
        InlineRenamer renamer = new InlineRenamer(supplier, "id", false);
        renamer.addDeclaredName("name$$1");
        String replacement = renamer.getReplacementName("name$$1");
        assertNotNull(replacement);
        assertTrue(replacement.contains("$$"));
    }

    @Test
    public void testContextualRenameInverterGetOrginalName() {
        assertEquals("org", ContextualRenameInverter.getOrginalName("org$$1"));
        assertEquals("name", ContextualRenameInverter.getOrginalName("name"));
        assertEquals("", ContextualRenameInverter.getOrginalName(""));
    }

    @Test
    public void testContextualRenameInverterGetOrginalNameInternal() {
        assertEquals("org", ContextualRenameInverter.getOrginalNameInternal("org$$1", 3));
        assertEquals("", ContextualRenameInverter.getOrginalNameInternal("$$1", 0));
    }

    @Test
    public void testContextualRenameInverterContainsSeparator() {
        assertTrue(ContextualRenameInverter.containsSeparator("name$$1"));
        assertTrue(!ContextualRenameInverter.containsSeparator("name"));
        assertTrue(!ContextualRenameInverter.containsSeparator(""));
    }

    @Test
    public void testContextualRenameInverterGetNameSuffix() {
        assertEquals("1", ContextualRenameInverter.getNameSuffix("name$$1", 4));
        assertEquals("", ContextualRenameInverter.getNameSuffix("name$$", 4));
    }

    @Test
    public void testContextualRenameInverterGetNameSuffixNoSeparator() {
        assertEquals("", ContextualRenameInverter.getNameSuffix("name", -1));
    }
}