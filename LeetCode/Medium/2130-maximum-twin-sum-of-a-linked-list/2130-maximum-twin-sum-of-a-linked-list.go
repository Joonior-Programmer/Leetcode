/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func pairSum(head *ListNode) int {
    ret := 0
    fast, slow := head, head
    var reverse *ListNode = nil
    for fast != nil {
        temp := slow
        slow = slow.Next
        fast = fast.Next.Next
        temp.Next = reverse
        reverse = temp
    }
    
    for slow != nil {
        temp := reverse.Val + slow.Val
        if temp > ret {
            ret = temp
        }
        slow = slow.Next
        reverse = reverse.Next
    }
    
    return ret
}