func countOdds(low int, high int) int {
    return (high - low) / 2 + boolToInt(low % 2 == 1 || high % 2 == 1);
}


func boolToInt(a bool) int {
    if a { return 1 }
    return 0
}