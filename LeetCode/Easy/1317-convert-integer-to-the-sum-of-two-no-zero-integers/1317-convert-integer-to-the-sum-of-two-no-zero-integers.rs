impl Solution {
    pub fn get_no_zero_integers(n: i32) -> Vec<i32> {
        let mut ret = 0;
        
        for i in 1..n {
            let mut temp = n - i;
            let mut tempI = i;

            while tempI > 0 {
                if tempI % 10 == 0 {
                    break
                }
                tempI /= 10;
            }

            if tempI != 0 { continue; }
            
            while temp > 0 {
                if temp % 10 == 0 {
                    break;
                }
                temp /= 10;
            }

            if temp == 0 { 
                ret = i; 
                break;
            }
        }
        
        vec![ret, n - ret]
    }
}