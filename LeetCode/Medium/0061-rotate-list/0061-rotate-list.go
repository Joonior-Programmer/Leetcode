/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func rotateRight(head *ListNode, k int) *ListNode {
    dummy := &ListNode{}
    dummy.Next = head
    
    curr := head
    length := 0
    
    for curr != nil {
        length++
        curr = curr.Next
    }
    
    if length == 0 { return head }
    
    k %= length
    
    if k == 0 { return head }
    
    slow := dummy
    fast := head
    
    for k < length {
        fast = fast.Next
        slow = slow.Next
        k++
    }
    
    slow.Next = nil
    dummy.Next = fast
    
    for fast.Next != nil {
        fast = fast.Next
    }
    
    fast.Next = head
    
    return dummy.Next
    
}