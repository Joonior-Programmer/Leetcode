/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func oddEvenList(head *ListNode) *ListNode {
    if head == nil || head.Next == nil { return head }
    
    odd := head
    evenHead := head.Next
    evenTail := head.Next
    curr := head.Next.Next
    
    for curr != nil {
        odd.Next = curr
        odd = odd.Next
        curr = curr.Next
        
        if curr != nil { 
            evenTail.Next = curr
            evenTail = evenTail.Next
            curr = curr.Next 
        }
    }
    
    odd.Next = evenHead
    evenTail.Next = nil

    return head
}