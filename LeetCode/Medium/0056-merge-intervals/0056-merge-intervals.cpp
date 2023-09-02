class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> ret;
        sort(intervals.begin(), intervals.end()); 
        vector<int> temp{intervals[0][0], intervals[0][1]};

        for (int i = 1; i < intervals.size(); ++i){
            if (temp[1] >= intervals[i][0]) temp[1] = max(temp[1], intervals[i][1]);
            else {
                ret.push_back(temp);
                temp = intervals[i];
            }
        }
        
        ret.push_back(temp);

        return ret;
    }
};