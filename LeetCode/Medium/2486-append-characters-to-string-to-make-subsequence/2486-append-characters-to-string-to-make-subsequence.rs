impl Solution {
    pub fn append_characters(s: String, t: String) -> i32 {
        let n = s.len();
        let m = t.len();
        let mut j = 0;
        let s_char = s.as_bytes();
        let t_char = t.as_bytes();
        
        for i in 0..n {
            if j == m { break; }
            if s_char[i] == t_char[j] { j += 1; }
        }

        (m - j) as i32
    }
}