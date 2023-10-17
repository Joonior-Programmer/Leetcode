class Solution {
public:
    vector<int> decrypt(vector<int>& code, int k) {
        vector<int> ret(code.size());
        
        if (k == 0) return ret;
        
        int n = code.size();

        if (k > 0){
            int last = 1;
            int temp = 0;
            int i = 1;
            
            while (last <= k){
                temp += code[last];
                last += 1;
            }

            ret[0] = temp;

            while (i < n){
                if (last == n) last = 0;
                temp -= code[i];
                temp += code[last++];
                ret[i++] = temp;
            }
        } else {
            int last = n + k;
            int temp = 0;
            int i = 1;
            
            while (last < n){
                temp += code[last];
                last += 1;
            }

            ret[0] = temp;

            while (k < 0){
                temp -= code[n + k++];
                temp += code[i - 1];
                ret[i++] = temp;
            }

            while (i < n){
                temp -= code[k++];
                temp += code[i-1];
                ret[i++] = temp;
            }
        }

        return ret;
    }
};