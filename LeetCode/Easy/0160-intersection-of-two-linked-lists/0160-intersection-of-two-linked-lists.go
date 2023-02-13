/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func getIntersectionNode(headA, headB *ListNode) *ListNode {
    exist := make(map[*ListNode]bool)
    
    for headA != nil {
        exist[headA] = true
        headA = headA.Next
    }
    
    for headB != nil {
        if exist[headB] {
            return headB
        }
        headB = headB.Next
    }
    
    return nil
}