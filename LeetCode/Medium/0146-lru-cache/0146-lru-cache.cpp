class LRUCache {
public:
    int capacity;
    int size;
    vector<int> data;
    vector<int> skip;
    deque<int> lru;
    
    LRUCache(int capacity): data(10001, -1), skip(10001, 0) {
        this->capacity = capacity;
        size = 0;
    }
    
    int get(int key) {
        if (data[key] == -1) return -1;
        
        ++skip[key];
        lru.push_front(key);
        return data[key];
    }
    
    void put(int key, int value) {
        if (data[key] == -1) ++size;
        
        data[key] = value;
        ++skip[key];
        lru.push_front(key);
        
        if (size > capacity){
            while (skip[lru.back()] != 1) {
                skip[lru.back()]--;
                lru.pop_back();
            }
            
            int temp = lru.back();
            lru.pop_back();
            skip[temp]--;
            data[temp] = -1;
            size--;
        }
    }
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */