/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func insertGreatestCommonDivisors(head *ListNode) *ListNode {
    curr := head
    
    gcd := func(a, b int) int { return 0 }
    gcd = func(a, b int) int {
        remainder := a % b
        if remainder > 0 { return gcd(b, remainder) }
        return b
    }
    
    for curr.Next != nil {
        tempNode := &ListNode{ gcd(curr.Val, curr.Next.Val), curr.Next }
        curr.Next = tempNode
        curr = curr.Next.Next
    }
    
    return head
}