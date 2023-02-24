class Solution {
    public boolean isIsomorphic(String s, String t) {
        // HashMap<Character, Character> check_s = new HashMap<>();
        // HashMap<Character, Character> check_t = new HashMap<>();
        // for (int i = 0; i < s.length(); ++i){
        //     if (!check_s.containsKey(s.charAt(i)) && !check_t.containsKey(t.charAt(i))){
        //         check_s.put(s.charAt(i), t.charAt(i));
        //         check_t.put(t.charAt(i), s.charAt(i));
        //     } else if (check_s.containsKey(s.charAt(i)) != check_t.containsKey(t.charAt(i))){
        //         return false;
        //     } else if (check_s.get(s.charAt(i)) != t.charAt(i) || check_t.get(t.charAt(i)) != s.charAt(i)){
        //         return false;
        //     }
        // }
        // return true;
        int[] map1 = new int[128];
        int[] map2 = new int[128];

        for (int i = 0; i < s.length(); ++i){
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) return false;

            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        return true;
    }
}