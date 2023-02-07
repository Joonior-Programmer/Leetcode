class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<>(){{add(1);}};
        for (int i = 1; i < rowIndex+1; ++i){
            List<Integer> temp = new ArrayList<>(){{addAll(ret);}};
            for(int j = 1; j < i + 1; ++j){
                if (i==j){
                    ret.add(1);
                } else {
                    ret.set(j, temp.get(j-1) + temp.get(j));
                }
            }
        }
        return ret;
    }
}