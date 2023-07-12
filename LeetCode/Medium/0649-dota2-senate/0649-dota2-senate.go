func predictPartyVictory(senate string) string {
    turn := make([]byte, len(senate))
    r := 0
    d := 0
    rSkip := 0
    dSkip := 0
    i := 0
    
    for i := 0; i < len(senate); i++ {
        if senate[i] == 'R' { 
            r++ 
        } else { d++ }
        turn[i] = senate[i]
    }
    
    for r > 0 && d > 0 {
        temp := turn[i]
        i++
        
        if temp == 'R' {
            if rSkip > 0 {
                rSkip--
                continue
            }
            d--
            dSkip++
        } else {
            if dSkip > 0 {
                dSkip--
                continue
            }
            r--
            rSkip++
        }
        
        turn = append(turn, temp)
    }
    
    if r > 0 { return "Radiant" }
    return "Dire"
}