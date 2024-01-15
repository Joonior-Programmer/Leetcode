class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> count = new HashMap();
        List<List<Integer>> ret = new ArrayList();
        ret.add(new ArrayList());
        ret.add(new ArrayList());
        
        for (int i = 0; i < matches.length; ++i){
            if (!count.containsKey(matches[i][0])) count.put(matches[i][0], 0);
            
            count.put(matches[i][1], count.getOrDefault(matches[i][1], 0) + 1);
        }
        
        for (Integer v : count.keySet()){
            int loses = count.get(v);
            
            if (loses == 0) ret.get(0).add(v);
            else if (loses == 1) ret.get(1).add(v);
        }

        Collections.sort(ret.get(0));
        Collections.sort(ret.get(1));
        
        return ret;
    }
}