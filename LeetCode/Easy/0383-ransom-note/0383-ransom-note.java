class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] counter = new int[26];
        for (char c : magazine.toCharArray()){
            ++counter[c - 'a'];
        }
        int location;
        for (char c : ransomNote.toCharArray()){
            location = c - 'a';
            if (counter[location] < 1) return false;
            counter[location]--;
        }
        return true;
    }
}