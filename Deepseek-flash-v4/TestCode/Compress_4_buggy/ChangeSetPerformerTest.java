package org.apache.commons.compress.changes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;

public class ChangeSetPerformerTest {

    // ---------- Stub classes ----------
    private static class FakeArchiveEntry implements ArchiveEntry {
        private final String name;
        FakeArchiveEntry(String name) { this.name = name; }
        @Override public String getName() { return name; }
        @Override public boolean isDirectory() { return false; }
        @Override public long getSize() { return 0; }
        @Override public long getLastModifiedDate() { return 0; }
    }

    private static class FakeArchiveInputStream extends ArchiveInputStream {
        private final Iterator<FakeArchiveEntry> iterator;
        FakeArchiveInputStream(List<FakeArchiveEntry> entries) {
            this.iterator = entries.iterator();
        }
        @Override public ArchiveEntry getNextEntry() {
            return iterator.hasNext() ? iterator.next() : null;
        }
        @Override public int read() { return -1; }
        @Override public int read(byte[] b, int off, int len) { return -1; }
        @Override public void close() {}
        @Override public boolean markSupported() { return false; }
    }

    private static class FakeArchiveOutputStream extends ArchiveOutputStream {
        private final List<String> writtenEntries = new ArrayList<>();
        @Override public void putArchiveEntry(ArchiveEntry entry) { writtenEntries.add(entry.getName()); }
        @Override public void closeArchiveEntry() {}
        @Override public void write(int b) {}
        @Override public void write(byte[] b, int off, int len) {}
        public List<String> getWrittenEntries() { return writtenEntries; }
    }

    private static class FakeChangeSet extends ChangeSet {
        private final Set<Change> changes;
        FakeChangeSet(Set<Change> changes) { this.changes = changes; }
        @Override public Set<Change> getChanges() { return new LinkedHashSet<>(changes); }
    }

    private static class FakeChange extends Change {
        private final int type;
        private final String targetFile;
        private final boolean replaceMode;
        private final ArchiveEntry entry;
        private final InputStream input;

        FakeChange(int type, String targetFile, boolean replaceMode, ArchiveEntry entry, InputStream input) {
            this.type = type;
            this.targetFile = targetFile;
            this.replaceMode = replaceMode;
            this.entry = entry;
            this.input = input;
        }
        @Override public int type() { return type; }
        @Override public String targetFile() { return targetFile; }
        @Override public boolean isReplaceMode() { return replaceMode; }
        @Override public ArchiveEntry getEntry() { return entry; }
        @Override public InputStream getInput() { return input; }
    }
    // ---------------------------------

    private ChangeSetPerformer performer;
    private FakeArchiveOutputStream out;

    @Before
    public void setUp() {
        out = new FakeArchiveOutputStream();
    }

    @Test
    public void testPerformNoChanges() throws IOException {
        List<FakeArchiveEntry> entries = Arrays.asList(
            new FakeArchiveEntry("a.txt"),
            new FakeArchiveEntry("b.txt")
        );
        FakeArchiveInputStream in = new FakeArchiveInputStream(entries);
        performer = new ChangeSetPerformer(new FakeChangeSet(new LinkedHashSet<Change>()));
        performer.perform(in, out);
        assertEquals(Arrays.asList("a.txt", "b.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformAddReplaceMode() throws IOException {
        Change change = new FakeChange(Change.TYPE_ADD, "new.txt", true,
            new FakeArchiveEntry("new.txt"), new ByteArrayInputStream(new byte[0]));
        performer = new ChangeSetPerformer(new FakeChangeSet(Collections.singleton(change)));
        List<FakeArchiveEntry> entries = Arrays.asList(new FakeArchiveEntry("existing.txt"));
        FakeArchiveInputStream in = new FakeArchiveInputStream(entries);
        performer.perform(in, out);
        assertEquals(Arrays.asList("new.txt", "existing.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformDelete() throws IOException {
        Change change = new FakeChange(Change.TYPE_DELETE, "delete.txt", false, null, null);
        performer = new ChangeSetPerformer(new FakeChangeSet(Collections.singleton(change)));
        List<FakeArchiveEntry> entries = Arrays.asList(
            new FakeArchiveEntry("a.txt"),
            new FakeArchiveEntry("delete.txt"),
            new FakeArchiveEntry("b.txt")
        );
        FakeArchiveInputStream in = new FakeArchiveInputStream(entries);
        performer.perform(in, out);
        assertEquals(Arrays.asList("a.txt", "b.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformDeleteDir() throws IOException {
        Change change = new FakeChange(Change.TYPE_DELETE_DIR, "dir", false, null, null);
        performer = new ChangeSetPerformer(new FakeChangeSet(Collections.singleton(change)));
        List<FakeArchiveEntry> entries = Arrays.asList(
            new FakeArchiveEntry("dir/file1.txt"),
            new FakeArchiveEntry("other.txt")
        );
        FakeArchiveInputStream in = new FakeArchiveInputStream(entries);
        performer.perform(in, out);
        assertEquals(Arrays.asList("other.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformAddNonReplaceMode() throws IOException {
        Change change = new FakeChange(Change.TYPE_ADD, "new.txt", false,
            new FakeArchiveEntry("new.txt"), new ByteArrayInputStream(new byte[0]));
        performer = new ChangeSetPerformer(new FakeChangeSet(Collections.singleton(change)));
        List<FakeArchiveEntry> entries = Arrays.asList(new FakeArchiveEntry("a.txt"));
        FakeArchiveInputStream in = new FakeArchiveInputStream(entries);
        performer.perform(in, out);
        assertEquals(Arrays.asList("a.txt", "new.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformAddThenDeleteSameFile() throws IOException {
        Set<Change> changes = new LinkedHashSet<>();
        changes.add(new FakeChange(Change.TYPE_ADD, "file.txt", true,
            new FakeArchiveEntry("file.txt"), new ByteArrayInputStream(new byte[0])));
        changes.add(new FakeChange(Change.TYPE_DELETE, "file.txt", false, null, null));
        performer = new ChangeSetPerformer(new FakeChangeSet(changes));
        List<FakeArchiveEntry> entries = Arrays.asList(new FakeArchiveEntry("file.txt"));
        FakeArchiveInputStream in = new FakeArchiveInputStream(entries);
        performer.perform(in, out);
        assertEquals(Arrays.asList("file.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformDeleteThenAddSameName() throws IOException {
        Set<Change> changes = new LinkedHashSet<>();
        changes.add(new FakeChange(Change.TYPE_DELETE, "file.txt", false, null, null));
        changes.add(new FakeChange(Change.TYPE_ADD, "file.txt", false,
            new FakeArchiveEntry("file.txt"), new ByteArrayInputStream(new byte[0])));
        performer = new ChangeSetPerformer(new FakeChangeSet(changes));
        List<FakeArchiveEntry> entries = Arrays.asList(new FakeArchiveEntry("file.txt"));
        FakeArchiveInputStream in = new FakeArchiveInputStream(entries);
        performer.perform(in, out);
        assertEquals(Arrays.asList("file.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformEmptyInputStreamWithNonReplaceAdd() throws IOException {
        Change change = new FakeChange(Change.TYPE_ADD, "new.txt", false,
            new FakeArchiveEntry("new.txt"), new ByteArrayInputStream(new byte[0]));
        performer = new ChangeSetPerformer(new FakeChangeSet(Collections.singleton(change)));
        FakeArchiveInputStream in = new FakeArchiveInputStream(Collections.<FakeArchiveEntry>emptyList());
        performer.perform(in, out);
        assertEquals(Arrays.asList("new.txt"), out.getWrittenEntries());
    }

    @Test
    public void testPerformEmptyInputStreamWithReplaceAdd() throws IOException {
        Change change = new FakeChange(Change.TYPE_ADD, "new.txt", true,
            new FakeArchiveEntry("new.txt"), new ByteArrayInputStream(new byte[0]));
        performer = new ChangeSetPerformer(new FakeChangeSet(Collections.singleton(change)));
        FakeArchiveInputStream in = new FakeArchiveInputStream(Collections.<FakeArchiveEntry>emptyList());
        performer.perform(in, out);
        assertEquals(Arrays.asList("new.txt"), out.getWrittenEntries());
    }
}