/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func splitListToParts(head *ListNode, k int) []*ListNode {
    n := 0
    curr := head

    for curr != nil{
        n++
        curr = curr.Next
    }

    curr = head

    ret := make([]*ListNode, k)

    need := n / k
    remain := n % k

    for i := 0; i < k; i++ {
        temp := curr
        count := need

        if remain > 0 {
            remain--
            count++
        }

        for j := 0; j < count - 1; j++ {
            if curr == nil { break }
            curr = curr.Next
        }

        if curr != nil {
            next := curr.Next
            curr.Next = nil
            curr = next
        }

        ret[i] = temp
    }

    return ret
}