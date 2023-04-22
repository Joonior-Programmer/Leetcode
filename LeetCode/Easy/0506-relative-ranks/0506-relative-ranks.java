class Solution {
    public String[] findRelativeRanks(int[] score) {
        int length = score.length;
        String[] ret = new String[length];
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        HashMap<Integer, String> ranks = new HashMap<>();
        
        int j = 1;
        for (int i = length - 1; i > -1; i--){

            ranks.put(sortedScore[i], j == 1 ? "Gold Medal" : 
                      j == 2 ? "Silver Medal" :
                     j == 3 ? "Bronze Medal" : String.valueOf(j));
            ++j;
        }

        for (int i = 0; i < length; ++i) ret[i] = ranks.get(score[i]);
        
        return ret;
    }
}