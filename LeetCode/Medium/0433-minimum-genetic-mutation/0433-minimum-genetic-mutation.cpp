class Solution {
public:
    int minMutation(string startGene, string endGene, vector<string>& bank) {
        int ret = 1;
        int idx = 0;
        vector<string> stack(1);
        stack[0] = startGene;
        vector<bool> used(bank.size());
        
        while (idx < stack.size()){
            int end = stack.size();
            
            for (int i = idx; i < end; ++i){
                string curr = stack[i];
                
                for (int j = 0; j < bank.size(); ++j){
                    if (used[j]) continue;
                    
                    int count = 0;
                    
                    for (int k = 0; k < 8; ++k)
                        if (curr[k] != bank[j][k]) ++ count;
                    
                    if (count == 1){
                        if (bank[j] == endGene) return ret;
                        stack.push_back(bank[j]);
                        used[j] = true;
                    }
                }
            }
            ++ret;
            idx = end;
        }
        
        return -1;
    }
};