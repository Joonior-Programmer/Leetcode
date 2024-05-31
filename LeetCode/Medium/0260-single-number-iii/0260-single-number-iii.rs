impl Solution {
    pub fn single_number(nums: Vec<i32>) -> Vec<i32> {
        let mut mask = 0;
        
        for v in &nums { mask ^= v; }
        
        mask &= -mask;
        
        let mut ret = vec![0,0];
        
        for v in &nums {
            if (mask & v) == 0 { ret[0] ^= v; }
            else { ret[1] ^= v; }
        }
        
        ret
    }
}