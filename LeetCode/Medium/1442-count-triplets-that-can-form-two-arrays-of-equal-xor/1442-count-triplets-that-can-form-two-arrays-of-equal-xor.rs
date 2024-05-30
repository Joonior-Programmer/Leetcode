impl Solution {
    pub fn count_triplets(arr: Vec<i32>) -> i32 {
        let n = arr.len();
        let mut ret = 0;
        
        for i in 0..n {
            let mut temp = arr[i];
            
            for j in i+1..n {
                temp ^= arr[j];
                if temp == 0 { ret += j - i; }
            }
        }
        
        ret as i32
    }
}