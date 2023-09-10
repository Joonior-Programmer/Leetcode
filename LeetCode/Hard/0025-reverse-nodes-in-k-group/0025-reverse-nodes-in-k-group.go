/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseKGroup(head *ListNode, k int) *ListNode {
    dummy := &ListNode{}
    dummy.Next = head
        
    nextPrev := dummy
    prev := dummy
    slow := dummy
    fast := head
    curr := head

    for curr != nil {
        count := 1

        for curr.Next != nil && count < k {
            count++
            curr = curr.Next
        }

        curr = curr.Next

        if count == k {
            prev = nextPrev
            nextPrev = fast
            for count > 0 {
                temp := fast.Next
                fast.Next = slow
                slow = fast
                fast = temp
                count--
            }

            prev.Next.Next = fast
            prev.Next = slow
        }
    }

    return dummy.Next
}