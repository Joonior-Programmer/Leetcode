func searchMatrix(matrix [][]int, target int) bool {
    down, up, left, right, mid := 0, len(matrix) - 1, 0, len(matrix[0]) - 1, 0
    
    for down <= up {
        mid = (up + down) / 2
        
        if matrix[mid][0] > target {
            up = mid - 1
        } else if matrix[mid][0] < target {
            if matrix[mid][right] >= target { break }
            down = mid + 1
        } else { return true }
    }
    
    row := matrix[mid]
    
    for left <= right {
        mid = (left + right) / 2
        
        if row[mid] > target {
            right = mid - 1
        } else if row[mid] < target {
            left = mid + 1
        } else { return true }
    }
    
    return false
}