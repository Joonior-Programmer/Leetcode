func minimumLength(s string) int {
    l,r := 0, len(s) - 1

    for l < r {
        if s[l] == s[r]{
            temp := s[l]

            for l <= r && s[l] == temp { l++ }
            for l <= r && s[r] == temp { r-- }
        } else { break }
    }

    return r - l + 1
}