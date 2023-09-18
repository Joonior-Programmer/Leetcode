class LRUCache {
    int capacity;
    int size;
    int[] data;
    int[] skip;
    LinkedList<Integer> leastRecentUsed;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        data = new int[10001];
        skip = new int[10001];
        leastRecentUsed = new LinkedList();
        
        for (int i = 0; i < 10001; ++i) data[i] = -1;
    }
    
    public int get(int key) {
        if (data[key] == -1) return -1;
        
        ++skip[key];
        leastRecentUsed.addFirst(key);
        
        return data[key];
    }
    
    public void put(int key, int value) {
        if (data[key] == -1) ++size;
        
        data[key] = value;
        ++skip[key];
        leastRecentUsed.addFirst(key);
        
        if (size > capacity){
            while (skip[leastRecentUsed.getLast()] != 1){
                skip[leastRecentUsed.getLast()]--;
                leastRecentUsed.removeLast();
            }
            int lru = leastRecentUsed.getLast();
            leastRecentUsed.removeLast();
            data[lru] = -1;
            skip[lru]--;
            size--;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */