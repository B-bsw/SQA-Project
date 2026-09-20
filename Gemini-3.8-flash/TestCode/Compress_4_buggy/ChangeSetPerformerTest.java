package org.apache.commons.compress.changes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChangeSetPerformerTest {

    private ChangeSet changeSet;

    @Before
    public void setUp() {
        changeSet = new ChangeSet();
    }

    @Test
    public void perform_givenEmptyChangeSetAndEmptyStream_shouldReturnEmptyResults() throws IOException {
        // Arrange
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);
        TestArchiveInputStream in = new TestArchiveInputStream(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        TestArchiveOutputStream out = new TestArchiveOutputStream();

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertNotNull(results);
        Assert.assertEquals(0, results.getAddedFromChangeSet().size());
        Assert.assertEquals(0, results.getAddedFromStream().size());
        Assert.assertEquals(0, results.getDeleted().size());
        Assert.assertEquals(0, out.getWrittenEntries().size());
    }

    @Test
    public void perform_givenEmptyChangeSet_shouldCopyAllEntriesFromStream() throws IOException {
        // Arrange
        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry("file1.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 1, 2 }));
        entries.add(new SimpleArchiveEntry("file2.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 3, 4 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertEquals(2, results.getAddedFromStream().size());
        Assert.assertTrue(results.hasBeenAdded("file1.txt"));
        Assert.assertTrue(results.hasBeenAdded("file2.txt"));
        Assert.assertEquals(2, out.getWrittenEntries().size());
    }

    @Test
    public void perform_givenAddWithReplaceMode_shouldAddFromChangeSetAndIgnoreStreamEntry() throws IOException {
        // Arrange
        SimpleArchiveEntry changeEntry = new SimpleArchiveEntry("replace.txt");
        InputStream changeStream = new ByteArrayInputStream(new byte[] { 9, 9 });
        changeSet.add(changeEntry, changeStream, true);

        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry("replace.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 1, 1 }));
        entries.add(new SimpleArchiveEntry("keep.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 2, 2 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertTrue(results.getAddedFromChangeSet().contains("replace.txt"));
        Assert.assertTrue(results.getAddedFromStream().contains("keep.txt"));
        Assert.assertFalse(results.getAddedFromStream().contains("replace.txt"));
        Assert.assertEquals(2, out.getWrittenEntries().size());
        Assert.assertEquals("replace.txt", ((ArchiveEntry) out.getWrittenEntries().get(0)).getName());
        Assert.assertEquals("keep.txt", ((ArchiveEntry) out.getWrittenEntries().get(1)).getName());
    }

    @Test
    public void perform_givenAddWithoutReplaceModeAndStreamHasSameName_shouldKeepStreamEntry() throws IOException {
        // Arrange
        SimpleArchiveEntry changeEntry = new SimpleArchiveEntry("file.txt");
        InputStream changeStream = new ByteArrayInputStream(new byte[] { 9 });
        changeSet.add(changeEntry, changeStream, false);

        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry("file.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 1 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertEquals(1, results.getAddedFromStream().size());
        Assert.assertTrue(results.getAddedFromStream().contains("file.txt"));
        Assert.assertEquals(0, results.getAddedFromChangeSet().size());
        Assert.assertEquals(1, out.getWrittenEntries().size());
    }

    @Test
    public void perform_givenAddWithoutReplaceModeAndStreamDoesNotHaveFile_shouldAddFromChangeSet() throws IOException {
        // Arrange
        SimpleArchiveEntry changeEntry = new SimpleArchiveEntry("newfile.txt");
        InputStream changeStream = new ByteArrayInputStream(new byte[] { 5, 5 });
        changeSet.add(changeEntry, changeStream, false);

        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry("existing.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 1, 1 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertTrue(results.getAddedFromStream().contains("existing.txt"));
        Assert.assertTrue(results.getAddedFromChangeSet().contains("newfile.txt"));
        Assert.assertEquals(2, out.getWrittenEntries().size());
        Assert.assertEquals("existing.txt", ((ArchiveEntry) out.getWrittenEntries().get(0)).getName());
        Assert.assertEquals("newfile.txt", ((ArchiveEntry) out.getWrittenEntries().get(1)).getName());
    }

    @Test
    public void perform_givenDeleteFile_shouldRemoveMatchingEntryFromStream() throws IOException {
        // Arrange
        changeSet.delete("delete_me.txt");

        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry("delete_me.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 1 }));
        entries.add(new SimpleArchiveEntry("retain.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 2 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertTrue(results.getDeleted().contains("delete_me.txt"));
        Assert.assertTrue(results.getAddedFromStream().contains("retain.txt"));
        Assert.assertEquals(1, out.getWrittenEntries().size());
        Assert.assertEquals("retain.txt", ((ArchiveEntry) out.getWrittenEntries().get(0)).getName());
    }

    @Test
    public void perform_givenDeleteDirectory_shouldDeleteMatchingChildrenEntries() throws IOException {
        // Arrange
        changeSet.deleteDir("folder");

        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry("folder/child1.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 1 }));
        entries.add(new SimpleArchiveEntry("folder/sub/child2.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 2 }));
        entries.add(new SimpleArchiveEntry("folder_outside.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 3 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertTrue(results.getDeleted().contains("folder/child1.txt"));
        Assert.assertTrue(results.getDeleted().contains("folder/sub/child2.txt"));
        Assert.assertFalse(results.getDeleted().contains("folder_outside.txt"));
        Assert.assertTrue(results.getAddedFromStream().contains("folder_outside.txt"));
        Assert.assertEquals(1, out.getWrittenEntries().size());
        Assert.assertEquals("folder_outside.txt", ((ArchiveEntry) out.getWrittenEntries().get(0)).getName());
    }

    @Test
    public void perform_givenDuplicateDeleteDirectives_shouldHandleSecondOccurrenceGracefully() throws IOException {
        // Arrange
        changeSet.delete("file.txt");
        changeSet.delete("file.txt");

        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry("file.txt"));
        streams.add(new ByteArrayInputStream(new byte[] { 1 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertEquals(1, results.getDeleted().size());
        Assert.assertTrue(results.getDeleted().contains("file.txt"));
        Assert.assertEquals(0, out.getWrittenEntries().size());
    }

    @Test
    public void perform_givenNullEntryNameAndEmptyWorkingSet_shouldCopyStreamEntry() throws IOException {
        // Arrange
        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry(null));
        streams.add(new ByteArrayInputStream(new byte[] { 1, 2, 3 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        ChangeSetResults results = performer.perform(in, out);

        // Assert
        Assert.assertEquals(1, out.getWrittenEntries().size());
        Assert.assertNull(((ArchiveEntry) out.getWrittenEntries().get(0)).getName());
        Assert.assertTrue(results.hasBeenAdded(null));
    }

    @Test(expected = NullPointerException.class)
    public void perform_givenNullEntryNameAndPendingDeleteInWorkingSet_shouldThrowNullPointerException() throws IOException {
        // Arrange
        changeSet.delete("target.txt");

        List entries = new ArrayList();
        List streams = new ArrayList();
        entries.add(new SimpleArchiveEntry(null));
        streams.add(new ByteArrayInputStream(new byte[] { 1 }));

        TestArchiveInputStream in = new TestArchiveInputStream(entries, streams);
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act
        performer.perform(in, out);
    }

    @Test
    public void perform_givenStreamThrowsIOExceptionOnNextEntry_shouldPropagateException() {
        // Arrange
        ArchiveInputStream brokenIn = new ArchiveInputStream() {
            public ArchiveEntry getNextEntry() throws IOException {
                throw new IOException("Stream read failed");
            }
            public int read() throws IOException {
                return -1;
            }
        };
        TestArchiveOutputStream out = new TestArchiveOutputStream();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act & Assert
        try {
            performer.perform(brokenIn, out);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            Assert.assertEquals("Stream read failed", e.getMessage());
        }
    }

    @Test
    public void perform_givenOutputStreamThrowsIOException_shouldPropagateException() {
        // Arrange
        changeSet.add(new SimpleArchiveEntry("fail.txt"), new ByteArrayInputStream(new byte[] { 1 }), true);
        TestArchiveInputStream in = new TestArchiveInputStream(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        TestArchiveOutputStream brokenOut = new TestArchiveOutputStream();
        brokenOut.setThrowOnPut(true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        // Act & Assert
        try {
            performer.perform(in, brokenOut);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            Assert.assertEquals("Simulated write error", e.getMessage());
        }
    }

    @Test
    public void perform_givenMultipleInvocations_shouldBeReusableAndProduceConsistentResults() throws IOException {
        // Arrange
        changeSet.delete("deleted.txt");
        changeSet.add(new SimpleArchiveEntry("added.txt"), new ByteArrayInputStream(new byte[] { 8 }), false);
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List entries1 = new ArrayList();
        List streams1 = new ArrayList();
        entries1.add(new SimpleArchiveEntry("deleted.txt"));
        streams1.add(new ByteArrayInputStream(new byte[] { 1 }));
        entries1.add(new SimpleArchiveEntry("normal.txt"));
        streams1.add(new ByteArrayInputStream(new byte[] { 2 }));

        TestArchiveInputStream in1 = new TestArchiveInputStream(entries1, streams1);
        TestArchiveOutputStream out1 = new TestArchiveOutputStream();

        List entries2 = new ArrayList();
        List streams2 = new ArrayList();
        entries2.add(new SimpleArchiveEntry("deleted.txt"));
        streams2.add(new ByteArrayInputStream(new byte[] { 1 }));
        entries2.add(new SimpleArchiveEntry("normal.txt"));
        streams2.add(new ByteArrayInputStream(new byte[] { 2 }));

        TestArchiveInputStream in2 = new TestArchiveInputStream(entries2, streams2);
        TestArchiveOutputStream out2 = new TestArchiveOutputStream();

        // Act
        ChangeSetResults results1 = performer.perform(in1, out1);
        ChangeSetResults results2 = performer.perform(in2, out2);

        // Assert
        Assert.assertEquals(results1.getAddedFromChangeSet(), results2.getAddedFromChangeSet());
        Assert.assertEquals(results1.getAddedFromStream(), results2.getAddedFromStream());
        Assert.assertEquals(results1.getDeleted(), results2.getDeleted());
        Assert.assertEquals(out1.getWrittenEntries().size(), out2.getWrittenEntries().size());
    }

    private static class SimpleArchiveEntry implements ArchiveEntry {
        private final String name;

        public SimpleArchiveEntry(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public long getSize() {
            return 0;
        }

        public boolean isDirectory() {
            return name != null && name.endsWith("/");
        }

        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    private static class TestArchiveInputStream extends ArchiveInputStream {
        private final List entries;
        private final List streams;
        private int currentIndex = -1;
        private InputStream currentStream = null;

        public TestArchiveInputStream(List entries, List streams) {
            this.entries = entries;
            this.streams = streams;
        }

        public ArchiveEntry getNextEntry() throws IOException {
            currentIndex++;
            if (currentIndex < entries.size()) {
                currentStream = (InputStream) streams.get(currentIndex);
                return (ArchiveEntry) entries.get(currentIndex);
            }
            currentStream = null;
            return null;
        }

        public int read() throws IOException {
            if (currentStream != null) {
                return currentStream.read();
            }
            return -1;
        }

        public int read(byte[] b, int off, int len) throws IOException {
            if (currentStream != null) {
                return currentStream.read(b, off, len);
            }
            return -1;
        }
    }

    private static class TestArchiveOutputStream extends ArchiveOutputStream {
        private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        private final List writtenEntries = new ArrayList();
        private boolean throwOnPut = false;

        public void setThrowOnPut(boolean throwOnPut) {
            this.throwOnPut = throwOnPut;
        }

        public void putArchiveEntry(ArchiveEntry entry) throws IOException {
            if (throwOnPut) {
                throw new IOException("Simulated write error");
            }
            writtenEntries.add(entry);
        }

        public void closeArchiveEntry() throws IOException {
        }

        public void finish() throws IOException {
        }

        public ArchiveEntry createArchiveEntry(File inputFile, String entryName) throws IOException {
            return new SimpleArchiveEntry(entryName);
        }

        public void write(int b) throws IOException {
            baos.write(b);
        }

        public void write(byte[] b, int off, int len) throws IOException {
            baos.write(b, off, len);
        }

        public List getWrittenEntries() {
            return writtenEntries;
        }
    }
}