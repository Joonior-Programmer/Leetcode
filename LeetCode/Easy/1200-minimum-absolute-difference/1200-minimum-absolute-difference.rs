impl Solution {
    pub fn minimum_abs_difference(mut arr: Vec<i32>) -> Vec<Vec<i32>> {
        arr.sort();
        
        let mut ret: Vec<Vec<i32>> = vec![];
        let mut minVal = i32::MAX;
        
        for i in 1..arr.len() {
            let temp = arr[i] - arr[i-1];
            if temp < minVal {
                minVal = temp;
                ret = vec![vec![arr[i-1], arr[i]]];
            } else if temp == minVal { ret.push(vec![arr[i-1], arr[i]]); }
        }
        
        return ret;
    }
}