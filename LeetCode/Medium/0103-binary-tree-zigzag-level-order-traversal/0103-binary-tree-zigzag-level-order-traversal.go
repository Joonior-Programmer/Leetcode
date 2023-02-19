/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func zigzagLevelOrder(root *TreeNode) [][]int {
    var ret [][]int
    if root == nil {return ret}
    var prev []*TreeNode
    prev = append(prev, root)
    isLeft := true
    

    for len(prev) != 0 {
        var temp []int
        var tempPrev []*TreeNode
        for i := 0; i < len(prev); i++ {
            temp = append(temp, prev[i].Val)
            if prev[i].Left != nil {
                tempPrev = append(tempPrev, prev[i].Left)
            }
            if prev[i].Right != nil {
                tempPrev = append(tempPrev, prev[i].Right)
            }
        }

        if !isLeft {
            for i,j := 0, len(temp)-1; i < j; i,j = i+1, j-1 {
                temp[i], temp[j] = temp[j], temp[i]
            }
        }
        
        ret = append(ret, temp)
        prev = tempPrev
        isLeft = !isLeft
    }
    
    return ret
}