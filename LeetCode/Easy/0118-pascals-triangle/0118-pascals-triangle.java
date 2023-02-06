class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();

        for (int i = 0; i < numRows; ++i){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < i+1; ++j){
                if (i == j || j == 0){
                    temp.add(1);
                } else {
                    temp.add(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
                }
            }
            ret.add(temp);
        }
        return ret;
    }
}