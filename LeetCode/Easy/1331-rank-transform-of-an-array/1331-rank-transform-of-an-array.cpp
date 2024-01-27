class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        vector<int> temp = arr;
        sort(temp.begin(), temp.end());
        unordered_map<int, int> map;
        
        int i = 0;
        int j = 1;
        
        while (i < arr.size()){
            map[temp[i++]] = j++;
            while (i < arr.size() && temp[i] == temp[i-1]) ++i;
        }
        
        for (int k = 0; k < arr.size(); ++k) arr[k] = map[arr[k]];
        
        return arr;
    }
};