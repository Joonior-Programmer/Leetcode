type MyQueue struct {
    Q []int
}


func Constructor() MyQueue {
    return MyQueue{make([]int, 0)}
}


func (this *MyQueue) Push(x int)  {
    this.Q = append(this.Q, x)
}


func (this *MyQueue) Pop() int {
    result := this.Q[0]
    this.Q = this.Q[1:]
    return result
}


func (this *MyQueue) Peek() int {
    return this.Q[0]
}


func (this *MyQueue) Empty() bool {
    return len(this.Q) == 0
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * param_2 := obj.Pop();
 * param_3 := obj.Peek();
 * param_4 := obj.Empty();
 */