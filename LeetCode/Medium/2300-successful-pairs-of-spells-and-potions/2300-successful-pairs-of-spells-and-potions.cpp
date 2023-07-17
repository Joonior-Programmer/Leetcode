class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        std::ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        cout.tie(NULL);

        vector<int> ret(spells.size());
        int spell = 0;

        for (int i = 0; i < spells.size(); ++i) spell = max(spells[i], spell);
        
        cout << spell << endl;

        vector<int> memo(spell + 1, 0);
        int i = 0;
        
        sort(potions.begin(), potions.end());

        while (spell > 0){
            while (i < potions.size()){
                if (potions[i] >= (double) success / spell) break;
                ++i;
            }
            memo[spell--] = potions.size() - i;
        }
        
        for (int j = 0; j < spells.size(); ++j) ret[j] = memo[spells[j]];
        
        return ret;
    }
};