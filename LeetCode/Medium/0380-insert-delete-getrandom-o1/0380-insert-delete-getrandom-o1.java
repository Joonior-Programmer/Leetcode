class RandomizedSet {
    private ArrayList<Integer> vals;
    private HashMap<Integer, Integer> map;
    private final Random random;

    public RandomizedSet() {
        this.vals = new ArrayList();
        this.map = new HashMap();
        this.random = new Random();
    }
    
    public boolean insert(int val) {
        if (map.getOrDefault(val, -1) != -1) return false;

        vals.add(val);
        map.put(val, map.size());
        return true;
    }
    
    public boolean remove(int val) {
        int idx = this.map.getOrDefault(val, -1);

        if (idx == -1) return false;

        int len = vals.size()-1;

        if (idx == len) vals.remove(len); 
        else {
            vals.set(idx, vals.get(len));
            vals.remove(len);
            map.put(vals.get(idx), idx);
        }

        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        return vals.get(random.nextInt(vals.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */