/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func partition(head *ListNode, x int) *ListNode {
    smallDummy := &ListNode{}
    bigDummy := &ListNode{}
    smallDummyHead := smallDummy
    bigDummyHead := bigDummy
    
    for head != nil {
        if head.Val < x {
            smallDummy.Next = head
            smallDummy = head
        } else {
            bigDummy.Next = head
            bigDummy = head
        }
        head = head.Next
    }
    
    smallDummy.Next = bigDummyHead.Next
    bigDummy.Next = nil
    
    return smallDummyHead.Next
}