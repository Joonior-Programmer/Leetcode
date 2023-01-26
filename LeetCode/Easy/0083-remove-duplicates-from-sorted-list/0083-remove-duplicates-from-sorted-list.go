/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteDuplicates(head *ListNode) *ListNode {
    if head == nil  {return head}
    curr := head.Next
    prev := head
    for (curr != nil) {
        for (curr != nil && curr.Val == prev.Val) {
            curr = curr.Next
        }
        if curr == nil {
            prev.Next = nil

        } else {
            prev.Next = curr
            prev = prev.Next
            curr = curr.Next
        }
    }
    return head
}