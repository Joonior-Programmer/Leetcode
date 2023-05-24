class RecentCounter {
    private LinkedList<Integer> q = new LinkedList();
    public RecentCounter() {
    }
    
    public int ping(int t) {
        this.q.addLast(t);
        while (this.q.getFirst() + 3000 < t) this.q.removeFirst();
        return this.q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */