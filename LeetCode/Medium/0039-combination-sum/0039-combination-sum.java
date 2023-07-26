class Solution {
    List<List<Integer>> ret;
    int target;
    int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ret = new LinkedList();
        this.target = target;
        this.candidates = candidates;
        DFS(new ArrayList(), 0, 0);
        return ret;
    }
    
    private void DFS(ArrayList<Integer> curr, int start, int sum){
        if (sum == target) {
            ret.add(new ArrayList(curr));
            return;
        }
        if (start >= candidates.length || sum > target) return;
        
        curr.add(candidates[start]);
        DFS(curr, start, sum + candidates[start]);
        curr.remove(curr.size() - 1);
        DFS(curr, start + 1, sum);
    }
}