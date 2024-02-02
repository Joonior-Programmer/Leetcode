class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ret = new ArrayList();
        
        for (int i = 1; i < 10; ++i){
            int j = i + 1;
            int temp = i;
            
            while (j < 10 && temp < high){
                temp = (temp * 10) + j;
                ++j;
                
                if (temp >= low && temp <= high) ret.add(temp);
            }
        }
        
        Collections.sort(ret);
        
        return ret;
    }
}