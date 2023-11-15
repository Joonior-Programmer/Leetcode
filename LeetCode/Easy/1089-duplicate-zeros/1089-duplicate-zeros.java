class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = arr.clone();
        int i = 0;
        int j = 0;
        int n = arr.length;
        while (j < n){
            while (j < n && temp[i] == 0){
                arr[j++] = 0;
                if (j < n) arr[j++] = 0;
                ++i;
            }

            if (j < n) arr[j++] = temp[i++];
        }
    }
}