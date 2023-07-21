class Solution {
    List<List<Integer>> ret;
    int k;
    int n;
    int last;

    public List<List<Integer>> combinationSum3(int k, int n) {
        ret = new ArrayList();
        this.k = k;
        this.n = n;
        last = Math.min(10, n);
        
        DFS(new ArrayList<Integer>(), 0, 1, 0);
        
        return ret;
    }
    
    private void DFS(ArrayList<Integer> curr, int idx, int startNum, int currSum){
        if (idx == k){
            if (currSum == n) ret.add(new ArrayList(curr));
            return;
        }
        
        for (int i = startNum; i < last; ++i){
            if (currSum + i > n) return;
            curr.add(i);
            DFS(curr, idx + 1, i + 1, currSum + i);
            curr.remove(curr.size()-1);
        }
    }
}