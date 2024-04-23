class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        
        while (i < arr.length - 2){
            if (arr[i+2] % 2 == 0) i += 3;
            else if (arr[i+1] % 2 == 0) i += 2;
            else if (arr[i] % 2 == 0) i += 1;
            else return true;
        }
        
        return false;
    }
}