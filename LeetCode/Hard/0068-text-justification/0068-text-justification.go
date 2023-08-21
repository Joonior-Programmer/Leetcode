func fullJustify(words []string, maxWidth int) []string {
    ret := make([]string, 0)
	l, r, curr, n := 0, 0, 0, len(words)

	var temp strings.Builder

	for r < n {
		if curr+len(words[r]) <= maxWidth {
			curr += len(words[r]) + 1
			r++
		} else {
			if l+1 == r {
				temp.WriteString(words[l])
				temp.WriteString(strings.Repeat(" ", maxWidth-curr+1))
			} else {
				numOfWords := r - l
				spaceNeeded := maxWidth - curr + numOfWords
				spaceEach := spaceNeeded / (numOfWords - 1)
				extraSpace := spaceNeeded % (numOfWords - 1)

				for i := l; i < r-1; i++ {
					temp.WriteString(words[i])
					temp.WriteString(strings.Repeat(" ", spaceEach))

					if extraSpace > 0 {
						temp.WriteString(" ")
						extraSpace--
					}
				}

				temp.WriteString(words[r-1])
			}

			ret = append(ret, temp.String())
			temp.Reset()
			l = r
			curr = len(words[r]) + 1
			r++
		}
	}

	temp.WriteString(words[l])

	for i := l + 1; i < r; i++ {
		temp.WriteString(" ")
		temp.WriteString(words[i])
	}

	temp.WriteString(strings.Repeat(" ", maxWidth-curr+1))
	ret = append(ret, temp.String())

	return ret
}