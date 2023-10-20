/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeKLists(lists []*ListNode) *ListNode {
    if len(lists) == 0 { return nil }
    if len(lists) == 1 { return lists[0] }
    
    mid := len(lists) / 2
    
    l1 := mergeKLists(lists[:mid])
    l2 := mergeKLists(lists[mid:])

    dummy := &ListNode{0, nil}

    curr := dummy

    for l1 != nil && l2 != nil {
        if l1.Val < l2.Val {
            curr.Next = l1
            l1, curr = l1.Next, curr.Next
        } else {
            curr.Next = l2
            l2, curr = l2.Next, curr.Next
        }
    }

    if l1 != nil { curr.Next = l1 }
    if l2 != nil { curr.Next = l2 }
    
    return dummy.Next
}