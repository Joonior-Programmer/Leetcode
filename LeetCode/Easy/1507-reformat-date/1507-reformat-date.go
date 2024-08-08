func reformatDate(date string) string {
    months := map[string]string{
		"Jan": "01", "Feb": "02", "Mar": "03", "Apr": "04",
		"May": "05", "Jun": "06", "Jul": "07", "Aug": "08",
		"Sep": "09", "Oct": "10", "Nov": "11", "Dec": "12",
	}

	ret := make([]string, 3)

	ret[0] = date[len(date)-4:]
	ret[1] = months[date[len(date)-8:len(date)-5]]

	if date[1] >= '0' && date[1] <= '9' { 
		ret[2] = date[0:2] 
	} else {
		ret[2] = "0" + date[0:1] 
	}

	return strings.Join(ret, "-")
}