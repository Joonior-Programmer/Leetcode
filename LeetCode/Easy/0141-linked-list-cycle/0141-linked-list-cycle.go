/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func hasCycle(head *ListNode) bool {
    checkExist := make(map[ListNode]bool)
    curr := head
    for curr != nil {
        if checkExist[*curr] {
            return true
        }
        checkExist[*curr] = true
        curr = curr.Next
    }
    return false
}