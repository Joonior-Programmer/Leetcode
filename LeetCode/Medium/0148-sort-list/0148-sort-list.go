/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func sortList(head *ListNode) *ListNode {
    count := make([]int, 200001)
    curr := head
    
    for curr != nil {
        count[curr.Val+100000]++
        curr = curr.Next
    }
    
    curr = head
    
    for i := 0; i < 200001; i++ {
        for count[i] != 0 {
            count[i]--
            curr.Val = i - 100000
            curr = curr.Next
        }
    }
    
    return head
}