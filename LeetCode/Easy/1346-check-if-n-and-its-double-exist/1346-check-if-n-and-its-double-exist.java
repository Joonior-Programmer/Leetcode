class Solution {
    public boolean checkIfExist(int[] arr) {
        int[] count = new int[6001];
        
        for (int i = 0; i < arr.length; ++i) ++count[arr[i]+3000];
        
        for (int i = 1500; i < 3000; ++i)
            if (count[i] > 0 && count[3000-(3000-i)*2] > 0)
                return true;
            
        if (count[3000] > 1) return true;
        
        for (int i = 3001; i < 4500; ++i)
            if (count[i] > 0 && count[i*2-3000] > 0) 
                return true;
        
        return false;
    }
}
