class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] time = new int[n];
        boolean[] exist = new boolean[1440];
        int i = 0;
        
        for (String v : timePoints){
            int temp = (v.charAt(0) - 48) * 600 + (v.charAt(1) - 48) * 60 + 
                (v.charAt(3) - 48) * 10 + v.charAt(4) - 48;
            
            if (exist[temp]) return 0;
            
            exist[temp] = true;
            time[i++] = temp;
        }
        
        Arrays.sort(time);
        
        int ret = 24 * 60 - time[n-1] + time[0];
        
        for (i = 1; i < n; ++i) ret = Math.min(ret, time[i] - time[i-1]);
        
        return ret;
    }
}