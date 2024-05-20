impl Solution {
    pub fn subset_xor_sum(nums: Vec<i32>) -> i32 {
        let mut ret: i32 = 0;

        for &v in &nums {
            ret |= v;
        }

        ret * (1 << (nums.len() - 1))
    }
}