class Solution {
    public int countLargestGroup(int n) {
        int ret = 0;
        int maxNum = 0;
        int[] count = new int[37];
        
        for (int i = 1; i < n + 1; ++i){
            int curr = i;
            int temp = 0;
            
            while (curr > 0){
                temp += curr % 10;
                curr /= 10;
            }
            
            ++count[temp];
        }
        
        for (int i = 1; i < 37; ++i){
            if (maxNum < count[i]){
                maxNum = count[i];
                ret = 1;
            } else if (maxNum == count[i]) ++ret;
        }
        
        return ret;
    }
}