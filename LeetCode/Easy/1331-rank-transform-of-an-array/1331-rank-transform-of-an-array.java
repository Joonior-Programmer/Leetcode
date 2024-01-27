class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap();
        
        int i = 0;
        int j = 1;
        while (i < arr.length){
            map.put(temp[i++], j++);
            while (i < arr.length && temp[i] == temp[i-1]) ++i;
        }
        
        for (int k = 0; k < arr.length; ++k) arr[k] = map.get(arr[k]);
        
        return arr;
    }
}