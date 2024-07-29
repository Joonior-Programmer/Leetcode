func decodeMessage(key string, message string) string {
    decode := make([]byte, 26)
	idx := 0

	for i := 0; i < len(key); i++ {
		v := key[i]
		if v != ' ' && decode[v-97] == 0 {
			decode[v-97] = byte(97 + idx)
			idx++
		}
	}

	var builder strings.Builder

	for i := 0; i < len(message); i++ {
		v := message[i]
		if v != ' ' {
			builder.WriteByte(decode[v-97])
		} else {
			builder.WriteByte(' ')
		}
	}

	return builder.String()
}