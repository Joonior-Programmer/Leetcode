class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> ret = new ArrayList();
        
        for (int i = 1; i < arr.length; ++i){
            int temp = Math.abs(arr[i] - arr[i-1]);
            if (temp < min){
                min = temp;
                ret = new ArrayList();
                ret.add( Arrays.asList(arr[i - 1], arr[i]) );
            } else if (temp == min) ret.add(Arrays.asList(arr[i - 1], arr[i]));
        }
        
        return ret;
    }
}