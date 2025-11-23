public class CustomHashMap {

    static class Entry {
        int key;
        String value;
        Entry next;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] table;
    private int capacity;

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    private int hash(int key) {
        return Math.abs(key) % capacity;
    }

    public void put(int key, String value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);

        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry current = table[index];
            Entry prev = null;
            while (current != null) {
                if (current.key == key) {
                    current.value = value; // Update value
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newEntry;
        }
    }

    public String get(int key) {
        int index = hash(key);
        Entry current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Entry current = table[index];
        Entry prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Removed key " + key);
                return;
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Key " + key + " not found.");
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap(10);
        map.put(1, "One");
        map.put(2, "Two");
        map.put(11, "Eleven"); // Collision with 1

        System.out.println("Get 1: " + map.get(1));
        System.out.println("Get 2: " + map.get(2));
        System.out.println("Get 11: " + map.get(11));
        System.out.println("Get 5: " + map.get(5));

        map.remove(1);
        System.out.println("Get 1 after remove: " + map.get(1));
        System.out.println("Get 11 after remove 1: " + map.get(11));
    }
}
