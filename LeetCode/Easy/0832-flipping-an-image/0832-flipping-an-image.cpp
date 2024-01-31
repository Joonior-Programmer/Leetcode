class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        for (vector<int>& row : image){
            int i = 0;
            int j = row.size() - 1;
            while (i <= j){
                int temp = row[i] == 1 ? 0 : 1;
                row[i] = row[j] == 1 ? 0 : 1;
                row[j] = temp;
                ++i;
                j--;
            }
        }
        
        return image;
    }
};