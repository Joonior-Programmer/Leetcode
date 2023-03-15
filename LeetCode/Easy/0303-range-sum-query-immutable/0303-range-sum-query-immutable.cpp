class NumArray {
public:
    vector<int> sumArray;
    NumArray(vector<int>& nums) {
        sumArray.push_back(nums[0]);
        for (int i = 1; i < nums.size(); ++i){
            sumArray.push_back(sumArray[i-1] + nums[i]);
        }
    }
    
    int sumRange(int left, int right) {
        return left == 0 ? sumArray[right] : sumArray[right] - sumArray[left - 1]; 
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */