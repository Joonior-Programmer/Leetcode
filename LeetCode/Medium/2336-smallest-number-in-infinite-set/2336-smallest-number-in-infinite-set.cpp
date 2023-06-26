class SmallestInfiniteSet {
public:
    bool heap[1001]{false,};
    int curr = 1;
    
    SmallestInfiniteSet() {
        
    }
    
    int popSmallest() {
        int ret = 0;
        for (int i = curr; i < 1001; ++i){
            if (!heap[i]){
                heap[i] = true;
                ret = i;
                break;
            }
        }
        curr = ret + 1;
        return ret;
    }
    
    void addBack(int num) {
        if (heap[num]){
            if (num < curr) curr = num;
            heap[num] = false;
        }
    }
};

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet* obj = new SmallestInfiniteSet();
 * int param_1 = obj->popSmallest();
 * obj->addBack(num);
 */