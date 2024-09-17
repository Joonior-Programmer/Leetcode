class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : words1) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        return result.toArray(new String[0]);
    }
}