class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        int n = words.length;
        
        String[] sortedWords = new String[n];
        int[] indexes = new int[n];
        
        for (int i = 0; i < n; i++) {
            String word = words[i];
            indexes[i] = word.charAt(word.length() - 1) - '0';
            sortedWords[i] = word.substring(0, word.length() - 1);
        }
        
        // Bubble sort based on indexes
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (indexes[j] > indexes[j + 1]) {
                    int tempIndex = indexes[j];
                    indexes[j] = indexes[j + 1];
                    indexes[j + 1] = tempIndex;
                    
                    String tempWord = sortedWords[j];
                    sortedWords[j] = sortedWords[j + 1];
                    sortedWords[j + 1] = tempWord;
                }
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(sortedWords[i]);
            if (i != n - 1) {
                result.append(' ');
            }
        }
        
        return result.toString();
    }
}