/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func spiralMatrix(m int, n int, head *ListNode) [][]int {
    ret := make([][]int, m)
    
    for i := range ret {
        row := make([]int, n)
        for j := range row {
            row[j] = -1
        }
        ret[i] = row
    }
    
    row := 0
    col := 0

    rowStart := 0
    colStart := 0

    for head != nil{
        for head != nil && col < n {
            ret[row][col] = head.Val
            head = head.Next
            col++
        }

        n--
        row++
        col--

        for head != nil && row < m {
            ret[row][col] = head.Val
            head = head.Next
            row++
        }

        m--
        row--
        col--

        for head != nil && col > colStart - 1 {
            ret[row][col] = head.Val
            head = head.Next
            col--
        }

        colStart++
        col++
        row--

        for head != nil && row > rowStart {
            ret[row][col] = head.Val
            head = head.Next
            row--
        }

        rowStart++
        row++
        col++
    }

    return ret
}