func findWords(words []string) []string {
    var keyboard = [26]int{1,0,0,1,2,1,1,1,2,1,1,1,0,0,2,2,2,2,1,2,2,0,2,0,2,0}
    ret := make([]string, 0)
    var first int
    var second int
    var third int
    var temp byte
    for i := 0; i < len(words); i++ {
        first = 0;
        second = 0;
        third = 0;

        for j := 0; j < len(words[i]); j++ {
            if words[i][j] > 96 {
                temp = words[i][j] - 32 - 'A'
            } else {
                temp = words[i][j] - 'A'
            }
            if (keyboard[temp] == 0) {
                first++
            } else {break}
        }

        if (first == len(words[i])) {
            ret = append(ret, words[i])
            continue;
        }

        for j := 0; j < len(words[i]); j++ {
            if words[i][j] > 96 {
                temp = words[i][j] - 32 - 'A'
            } else {
                temp = words[i][j] - 'A'
            }
            if (keyboard[temp] == 1) {
                second++
            } else {break}
        }

        if (second == len(words[i])) {
            ret = append(ret, words[i])
            continue;
        }

        for j := 0; j < len(words[i]); j++ {
            if words[i][j] > 96 {
                temp = words[i][j] - 32 - 'A'
            } else {
                temp = words[i][j] - 'A'
            }
            if (keyboard[temp] == 2) {
                third++
            } else {break}
        }

        if (third == len(words[i])) {
            ret = append(ret, words[i])
        }
    }
    return ret
}