package HashTables;

import java.util.LinkedList;

public class HashTable {

    private LinkedList<Entry>[] items;

    private class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        items = (LinkedList<Entry>[])(new LinkedList[capacity]);
    }

    public void put(int key, String value)
    {
        var entry = getEntry(key);
        if(entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).add(
                new Entry(key, value)
        );
    }

    public String get(int key)
    {
        var entry = getEntry(key);
        return entry == null ? null: entry.value;
    }

    public void remove(int key)
    {
        var entry = getEntry(key);
        if(entry == null) throw new IllegalStateException();

        getBucket(key).remove(entry);
    }

    private Entry getEntry(int key)
    {
        var index = hash(key);

        if(items[index] != null){
            for(var e: items[index])
                if(e.key == key) return e;
        }

        return null;
    }

    private LinkedList<Entry> getBucket(int key) {
        return items[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key)
    {
        var index = hash(key);
        if(items[index] == null)
            items[index] = new LinkedList<>();

        return items[index];
    }

    private int hash(int key)
    {
        return Math.abs(key) % items.length;
    }
}
