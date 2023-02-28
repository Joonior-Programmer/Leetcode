type MyStack struct {
    Q []int 
}


func Constructor() MyStack {
    return MyStack{Q: make([]int, 0)}
}


func (this *MyStack) Push(x int)  {
    this.Q = append(this.Q, x)
}


func (this *MyStack) Pop() int {
    ret := this.Top()
    this.Q = this.Q[:len(this.Q)-1]
    return ret
}


func (this *MyStack) Top() int {
    return this.Q[len(this.Q)-1]
}


func (this *MyStack) Empty() bool {
    return len(this.Q) == 0
}


/**
 * Your MyStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * param_2 := obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.Empty();
 */