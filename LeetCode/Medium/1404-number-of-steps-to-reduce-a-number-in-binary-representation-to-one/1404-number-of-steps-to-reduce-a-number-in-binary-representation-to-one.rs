impl Solution {
    pub fn num_steps(s: String) -> i32 {
        let bytes = s.as_bytes();
        let mut ret = 0;
        let mut r = s.len() - 1;
        let mut lead = 0;
        
        while r > 0 {
            let temp = (bytes[r] as i32 - 48) + lead;
            
            if temp == 0 {
                ret += 1;
                lead = 0;
            } else if temp == 2 {
                ret += 1;
                lead = 1;
            } else {
                ret += 2;
                lead = 1;
            }
            
            r -= 1;
        }
        
        if lead == 1 { ret += 1; }
        
        ret
    }
}