func convert(s string, numRows int) string {
    n := len(s)
    
    if numRows == 1 || n <= numRows {
		return s
	}
    
	var buffer bytes.Buffer
	cycleLen := 2*numRows - 2

	for i := 0; i < numRows; i++ {
		for j := 0; j+i < n; j += cycleLen {
			buffer.WriteByte(s[i+j])

			if i != 0 && i != numRows-1 && j+cycleLen-i < n {
				buffer.WriteByte(s[j+cycleLen-i])
			}
		}
	}

	return buffer.String()
}