class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splited = s.split(" ");
        if (pattern.length() != splited.length) return false;
        HashSet<String> used = new HashSet<>();
        String[] container = new String[26];

        for(int i = 0; i < pattern.length(); ++i){
            if (container[pattern.charAt(i) - 'a'] == null && !used.contains(splited[i])){
                container[pattern.charAt(i) - 'a'] = splited[i];
                used.add(splited[i]);
            } else if (container[pattern.charAt(i) - 'a'] == null || !container[pattern.charAt(i) - 'a'].equals(splited[i])) return false;
        }
        return true;
    }
}