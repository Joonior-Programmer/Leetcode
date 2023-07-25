/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    ret := &ListNode{}
    curr := ret
    currSum := 0
    
    for l1 != nil && l2 != nil {
        currSum += l1.Val + l2.Val
        curr.Next = &ListNode{currSum % 10, nil}
        currSum /= 10
        
        l1 = l1.Next
        l2 = l2.Next
        curr = curr.Next
    }
    
    for l1 != nil {
        currSum += l1.Val
        curr.Next = &ListNode{currSum % 10, nil}
        currSum /= 10
        
        l1 = l1.Next
        curr = curr.Next
    }
    
    for l2 != nil {
        currSum += l2.Val
        curr.Next = &ListNode{currSum % 10, nil}
        currSum /= 10
        
        l2 = l2.Next
        curr = curr.Next
    }
    
    if currSum > 0 { curr.Next = &ListNode{currSum, nil} }
    
    return ret.Next
}