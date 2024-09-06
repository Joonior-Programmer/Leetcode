/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func modifiedList(nums []int, head *ListNode) *ListNode {
    exist := make([]bool, 100001)
        
    ret := &ListNode{0, head}
    curr := ret

    for i := 0; i < len(nums); i++ { exist[nums[i]] = true }

    for curr.Next != nil {
        if exist[curr.Next.Val] {
            curr.Next = curr.Next.Next
        } else { curr = curr.Next }
    }

    return ret.Next
}