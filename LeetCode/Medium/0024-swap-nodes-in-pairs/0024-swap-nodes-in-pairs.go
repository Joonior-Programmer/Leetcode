/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func swapPairs(head *ListNode) *ListNode {
    dummy := ListNode{0, nil}
        
    curr := &dummy

    for head != nil {
        if head.Next != nil {
            temp := head.Next.Next
            curr.Next = head.Next
            curr.Next.Next = head
            curr.Next.Next.Next = nil
            head = temp
        } else {
            curr.Next = head
            head = nil
        }
        curr = curr.Next.Next
    }

    return dummy.Next
}