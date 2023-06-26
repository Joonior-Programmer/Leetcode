class SmallestInfiniteSet {
    boolean[] heap = new boolean[1001];
    int curr = 1;
    
    public SmallestInfiniteSet() {}
    
    public int popSmallest() {
        int ret = 0;
        for (int i = curr; i < 1001; ++i){
            if (!heap[i]) {
                ret = i;
                heap[i] = true;
                break;
            }
        }
        curr = ret + 1;
        return ret;
    }
    
    public void addBack(int num) {
        if (heap[num]) {
            if (num < curr) curr = num;
            heap[num] = false;
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */