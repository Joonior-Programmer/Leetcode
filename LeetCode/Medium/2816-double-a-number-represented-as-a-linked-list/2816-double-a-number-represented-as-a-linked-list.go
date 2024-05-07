/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func doubleIt(head *ListNode) *ListNode {
    if head.Val > 4 { head = &ListNode{0, head} }
    
    curr := head
    
    for curr != nil {
        curr.Val = curr.Val * 2 % 10
        
        if curr.Next != nil && curr.Next.Val > 4 { curr.Val++ }
        curr = curr.Next
    }
    
    return head
}