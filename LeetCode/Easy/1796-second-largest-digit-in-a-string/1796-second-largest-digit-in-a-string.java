class Solution {
    public int secondHighest(String s) {
        int first = -1, second = -1;
        boolean[] used = new boolean[10];

        for (char v : s.toCharArray()){
            if (v > 47 && v < 58 && !used[v - 48]){
                int temp = v - 48;

                if (temp > first){
                    second = first;
                    first = temp;
                } else if (temp > second) second = temp;

                used[temp] = true;
            }
        }

        return second;
    }
}