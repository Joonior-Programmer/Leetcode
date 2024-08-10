class Solution {
public:
    int secondHighest(string s) {
        int first = -1, second = -1;
        vector<bool> used(10);

        for (char v : s){
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
};