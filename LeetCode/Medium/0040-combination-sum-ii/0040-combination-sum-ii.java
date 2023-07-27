class Solution {
    List<List<Integer>> ret;
    int[] candidates;
    int target;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ret = new ArrayList();
        this.candidates = candidates;
        this.target = target;
        
        DFS(new ArrayList(), 0, 0);
        return ret;
    }
    
    private void DFS(ArrayList<Integer> curr, int idx, int sum){
        if (sum == target){
            ret.add(new ArrayList(curr));
            return;
        }
        
        if (idx >= candidates.length || target < sum) return;
        
        curr.add(candidates[idx]);
        DFS(curr, idx + 1, sum + candidates[idx]);
        
        int temp = idx + 1;
        while (temp < candidates.length && candidates[temp] == candidates[idx]) ++temp;
        curr.remove(curr.size() - 1);
        
        DFS(curr, temp, sum);
    }
}