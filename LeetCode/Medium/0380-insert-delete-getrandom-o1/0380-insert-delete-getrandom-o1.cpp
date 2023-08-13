class RandomizedSet {
public:
    unordered_map<int, int> map;
    vector<int> vals;
    
    RandomizedSet() {}
    
    bool insert(int val) {
        if (map.find(val) != map.end()) return false;
        
        map[val] = vals.size();
        vals.push_back(val);
        
        return true;
    }
    
    bool remove(int val) {
        if (map.find(val) == map.end()) return false;
        
        int idx = map[val];
        int len = vals.size() - 1;
        
        if (idx != len) {
            vals[idx] = vals[len];
            map[vals[idx]] = idx;
        }
        
        vals.pop_back();
        map.erase(val);
        
        return true;
    }
    
    int getRandom() {
        return vals[rand() % vals.size()];
    }
};

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */