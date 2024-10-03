func convertDateToBinary(date string) string {
    parts := strings.Split(date, "-")

	year, _ := strconv.Atoi(parts[0])
	month, _ := strconv.Atoi(parts[1])
	day, _ := strconv.Atoi(parts[2])

	binaryYear := strconv.FormatInt(int64(year), 2)
	binaryMonth := strconv.FormatInt(int64(month), 2)
	binaryDay := strconv.FormatInt(int64(day), 2)

	return fmt.Sprintf("%s-%s-%s", binaryYear, binaryMonth, binaryDay)
}