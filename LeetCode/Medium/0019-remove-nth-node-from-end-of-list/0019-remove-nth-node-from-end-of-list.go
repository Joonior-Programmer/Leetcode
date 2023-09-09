/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeNthFromEnd(head *ListNode, n int) *ListNode {
    slow := head
    fast := head
    
    for i := 0; i < n; i++ { fast = fast.Next }
    
    if fast == nil { return slow.Next }
    
    for fast.Next != nil {
        fast = fast.Next
        slow = slow.Next
    }
    
    slow.Next = slow.Next.Next
    
    return head
}