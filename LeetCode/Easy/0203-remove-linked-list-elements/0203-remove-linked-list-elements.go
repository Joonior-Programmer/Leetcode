/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeElements(head *ListNode, val int) *ListNode {
    cur := head
    for cur != nil && cur.Val == val {
        cur = cur.Next
        head = cur
    }
    
    for cur != nil {
        if cur.Next != nil && cur.Next.Val == val {
            cur.Next = cur.Next.Next
        } else {
            cur = cur.Next
        }
    }
    return head
}