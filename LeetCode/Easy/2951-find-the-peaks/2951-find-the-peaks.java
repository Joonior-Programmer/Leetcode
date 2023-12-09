class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ret = new ArrayList();
        
        for (int i = 1; i < mountain.length-1; ++i)
            if (mountain[i] > mountain[i+1] && mountain[i] > mountain[i-1]) ret.add(i);
        
        return ret;
    }
}