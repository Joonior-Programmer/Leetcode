class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        int ret = 0;
        int prev = 0;
        
        for (string row : bank){
            int temp = 0;
            for (int i = 0; i < row.size(); ++i) temp += row[i] - '0';
            
            if (temp > 0){
                ret += prev * temp;
                prev = temp;
            }
        }
        
        return ret;
    }
};