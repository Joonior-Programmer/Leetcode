class Solution {
    char[][] dial = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'}, {'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
    List<String> ret;
    int n;
    char[] digits;
    
    public List<String> letterCombinations(String digits) {
        ret = new ArrayList<>();
        this.digits = digits.toCharArray();
        n = this.digits.length;
        if (n > 0) DFS(new char[n], 0);
        
        return ret;
    }
    
    private void DFS(char[] curr, int idx){
        if (idx == n) {
            ret.add(new String(curr));
            return;
        }
        
        for (int i = 0; i < dial[digits[idx] - '2'].length; ++i){
            curr[idx] = dial[digits[idx] - '2'][i];
            DFS(curr.clone(), idx + 1);
        }
    }
}