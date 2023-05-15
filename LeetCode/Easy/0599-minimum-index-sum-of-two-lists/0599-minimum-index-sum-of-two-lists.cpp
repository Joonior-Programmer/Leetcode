class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        unordered_map<string, int> exist;
        
        vector<string> ret;
        int minVal = INT_MAX;
        int j;
        for (int i = 0; i < list1.size(); ++i) exist[list1[i]] = i;
        
        for (int i = 0; i < list2.size(); ++i){
            if (exist.find(list2[i]) != exist.end()){
                j = exist[list2[i]];
                if (j + i < minVal){
                    minVal = j + i;
                    ret.clear();
                    ret.push_back(list2[i]);
                } else if (j + i == minVal) ret.push_back(list2[i]);
            }
        }
        
        return ret;
    }
};