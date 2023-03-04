/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func isPalindrome(head *ListNode) bool {
    ret := make([]int, 0)
    length := -1
    for head != nil{
        ret = append(ret, head.Val)
        head = head.Next
        length++
    }
    i := 0
    for i < length {
        if ret[i] != ret[length] { return false }
        i++
        length--
    }
    return true
}