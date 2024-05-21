impl Solution {
    pub fn is_array_special(nums: Vec<i32>) -> bool {
        let mut isOdd = nums[0] % 2 != 0;
        
        for i in 1..nums.len() {
            if (nums[i] % 2 != 0) == isOdd { return false; }
            isOdd = !isOdd;
        }
        
        true
    }
}