use std::cmp::max;

impl Solution {
    pub fn equal_substring(s: String, t: String, max_cost: i32) -> i32 {
        let n = s.len();
        let mut ret = 0;
        let mut diff = vec![];
        let mut l = 0;
        let mut curr = 0;
        
        for (sc, tc) in s.chars().zip(t.chars()) {
            diff.push((sc as i32 - tc as i32).abs() as i32);
        }
        
        for r in 0..n {
            curr += diff[r];
            if curr > max_cost {
                curr -= diff[l];
                l += 1
            }
            
            ret = max(ret, (r - l + 1) as i32);
        }
        
        return ret;
    }
}