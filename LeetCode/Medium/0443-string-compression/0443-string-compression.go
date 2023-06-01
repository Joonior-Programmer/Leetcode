func compress(chars []byte) int {
        var prev byte
        var prev_count int
        i := 0
        idx := 0
        temp := ""
        
        for i < len(chars) {
            prev = chars[i]
            prev_count = 1
            i++
            for i < len(chars) && prev == chars[i] {
                i++
                prev_count++
            }
            
            chars[idx] = prev;
            idx++
            if (prev_count != 1) {
                temp = strconv.Itoa(prev_count)
                for i := 0; i < len(temp); i++ {
                    chars[idx] = temp[i];  
                    idx++
                } 
            }
        }
        
        return idx;
}