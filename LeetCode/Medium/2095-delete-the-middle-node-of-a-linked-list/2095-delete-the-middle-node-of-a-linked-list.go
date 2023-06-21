/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteMiddle(head *ListNode) *ListNode {
    if head.Next == nil { return nil }
    
    slowest := head
    slow := head
    fast := head
    
    for fast != nil && fast.Next != nil {
        slowest = slow
        slow = slow.Next
        fast = fast.Next.Next
    }
    
    slowest.Next = slow.Next
    
    return head
}