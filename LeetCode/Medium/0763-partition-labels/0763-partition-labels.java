class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] idxs = new int[26];
        char[] sCharArray = s.toCharArray();

        for (int i = 0; i < sCharArray.length; ++i) idxs[sCharArray[i]-97] = i;

        int size = 0;
        int end = idxs[sCharArray[0]-97];
        List<Integer> ret = new ArrayList();

        for (int i = 0; i < sCharArray.length; ++i){
            ++size;
            end = Math.max(end, idxs[sCharArray[i]-97]);
            
            if (end == i) {
                ret.add(size);
                size = 0;
            }
        }

        return ret;
    }
}