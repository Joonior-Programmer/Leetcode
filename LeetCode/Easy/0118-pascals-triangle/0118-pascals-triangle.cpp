class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ret;
        for (int i = 0; i < numRows; ++i){
            vector<int> temp;
            for(int j = 0; j < i+1; ++j){
                if (j == i || j == 0){
                    temp.push_back(1);
                } else {
                    temp.push_back(ret[i-1][j-1] + ret[i-1][j]);
                }
            }
            ret.push_back(temp);
        }
        return ret;
    }
};

// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ret = new ArrayList<>();

//         for (int i = 0; i < numRows; ++i){
//             List<Integer> temp = new ArrayList<>();
//             for(int j = 0; j < i+1; ++j){
//                 if (i == j || j == 0){
//                     temp.add(1);
//                 } else {
//                     temp.add(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
//                 }
//             }
//             ret.add(temp);
//         }
//         return ret;
//     }
// }