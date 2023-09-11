/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteDuplicates(head *ListNode) *ListNode {
    dummy := &ListNode{}
    dummy.Next = head
    slow := dummy
    fast := head
    
    for fast != nil {
        if fast.Next != nil && fast.Val == fast.Next.Val {
            for fast.Next != nil && fast.Val == fast.Next.Val { fast.Next = fast.Next.Next }
            fast = fast.Next
            slow.Next = fast
        } else {
            fast = fast.Next
            slow = slow.Next
        }
    }
    
    return dummy.Next
}