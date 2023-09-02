class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        ArrayList<int[]> ret = new ArrayList();
        
        Arrays.sort(intervals, new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            return a[0]-b[0]; 
            }
        });
        
        int i = 0;
        while (i < n){
            int[] temp = new int[]{intervals[i][0], intervals[i][1]};
            ++i;
            while (i < n && temp[1] >= intervals[i][0]) temp[1] = Math.max(temp[1], intervals[i++][1]); 
            ret.add(temp);
        }
        
        return ret.toArray(new int[ret.size()][]);
    }
}