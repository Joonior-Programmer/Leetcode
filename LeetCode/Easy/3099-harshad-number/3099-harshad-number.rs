impl Solution {
    pub fn sum_of_the_digits_of_harshad_number(x: i32) -> i32 {
        let mut copyX = x;
        let mut ret = 0;
        
        while copyX > 0 {
            ret += copyX % 10;
            copyX /= 10;
        }
        
        if x % ret != 0 { 
            return -1
        }
        
        ret
    }
}