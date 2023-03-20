class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] ret = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            while (i < j && !vowel.contains(s.charAt(i))) ++i;
            while (i < j && !vowel.contains(s.charAt(j))) --j;
            if (i < j) {
                char temp = ret[i];
                ret[i] = ret[j];
                ret[j] = temp;
                ++i;
                j--;
            }
        }
        return new String(ret);
    }
}