class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        vector<int> count(1001);
        int idx = 0;
        
        for (int i = 0; i < arr1.size(); ++i) ++count[arr1[i]];
        
        for (int v : arr2){
            while (count[v] > 0){
                arr1[idx++] = v;
                count[v]--;
            }
        }
        
        for (int i = 0; i < 1001; ++i)
            while (count[i] > 0){
                arr1[idx++] = i;
                count[i]--;
            }
        
        return arr1;
    }
};