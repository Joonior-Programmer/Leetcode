func interpret(command string) string {
    var ret bytes.Buffer
    prev := command[0]
    
    for i := 0; i < len(command); i++ {
        temp := command[i]
        if temp == 'G' {
            ret.WriteRune('G')
        } else if temp == ')' {
            if prev == 'l' {
                ret.WriteString("al")
            } else { ret.WriteRune('o') }
        }

        prev = temp
    }

    return ret.String()
}