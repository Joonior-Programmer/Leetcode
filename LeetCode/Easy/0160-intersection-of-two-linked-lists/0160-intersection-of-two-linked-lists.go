/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func getIntersectionNode(headA, headB *ListNode) *ListNode {
    // exist := make(map[*ListNode]bool)
    
    // for headA != nil {
    //     exist[headA] = true
    //     headA = headA.Next
    // }
    
    // for headB != nil {
    //     if exist[headB] {
    //         return headB
    //     }
    //     headB = headB.Next
    // }
    
    // return nil

    lenA := 0
    lenB := 0
    curA := headA
    curB := headB

    for curA != nil {
        lenA++
        curA = curA.Next
    }

    for curB != nil {
        lenB++
        curB = curB.Next
    }

    if lenA > lenB {
        for lenA > lenB {
            headA = headA.Next
            lenB++
        }
    } else if lenB > lenA {
        for lenB > lenA {
            headB = headB.Next
            lenA++
        }
    }

    for headA != nil && headB != nil {
        if headA == headB {
            return headA
        }
        headA = headA.Next
        headB = headB.Next
    }

    return nil
}