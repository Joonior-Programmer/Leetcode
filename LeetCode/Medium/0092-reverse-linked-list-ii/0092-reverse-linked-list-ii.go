/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseBetween(head *ListNode, left int, right int) *ListNode {
    if left == right { return head }
    
    dummy := &ListNode{}
    pre := dummy
    dummy.Next = head
    
    for i := 1; i < left; i++ { pre = pre.Next }
    
    curr := pre.Next
    var prev *ListNode
    
    for i := 0; i < right-left+1; i++ {
        temp := curr.Next
        curr.Next = prev
        prev = curr
        curr = temp
    }
    
    pre.Next.Next = curr
    pre.Next = prev
    
    return dummy.Next
}