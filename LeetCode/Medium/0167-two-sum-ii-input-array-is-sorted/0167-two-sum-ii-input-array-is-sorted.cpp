class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int first = 0;
        int second = numbers.size() - 1;
        
        while (first < second){
            int sum = numbers[first] + numbers[second];
            
            if (sum > target) second--;
            else if (sum < target) ++first;
            else break;
        }
        
        return vector<int>{first+1, second+1};
    }
};