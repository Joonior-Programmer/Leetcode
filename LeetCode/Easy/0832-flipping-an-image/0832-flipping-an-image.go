func flipAndInvertImage(image [][]int) [][]int {
    for _, row := range image {
        i := 0
        j := len(row) - 1
        for i < j{
            row[i], row[j] = row[j], row[i]
            
            if row[i] == 0 {
                row[i] = 1
            } else {
                row[i] = 0
            }
            
            if row[j] == 0 {
                row[j] = 1
            } else {
                row[j] = 0
            }
            
            i++
            j--
        }
        
        if len(row) % 2 == 1 { 
            mid := len(row)/2
            if row[mid] == 1 { 
                row[mid] = 0
            } else {
                row[mid] = 1
            }
        }
    }
        
    return image
}