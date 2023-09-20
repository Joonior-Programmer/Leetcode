/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
type BSTIterator struct {
    ret []int
    idx int
}



func Constructor(root *TreeNode) BSTIterator {
    ret := BSTIterator{}
    
    inorder := func(node *TreeNode){}
    inorder = func(node *TreeNode){
        if node == nil { return }
        
        inorder(node.Left)
        ret.ret = append(ret.ret, node.Val)
        inorder(node.Right)
    }
    
    inorder(root)

    return ret
}


func (this *BSTIterator) Next() int {
    ret := this.ret[this.idx]
    this.idx++
    return ret
}


func (this *BSTIterator) HasNext() bool {
    return this.idx < len(this.ret)
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * obj := Constructor(root);
 * param_1 := obj.Next();
 * param_2 := obj.HasNext();
 */