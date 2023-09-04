type MinStack struct {
    Stack []int
    MinContainer []int
}


func Constructor() MinStack {
    ret := MinStack{make([]int, 0), make([]int, 1)}
    ret.MinContainer[0] = 2147483647
    return ret
}


func (this *MinStack) Push(val int)  {
    this.Stack = append(this.Stack, val)
    this.MinContainer = append(this.MinContainer, min(val, this.MinContainer[len(this.MinContainer)-1]))
}


func (this *MinStack) Pop()  {
    this.Stack = this.Stack[:len(this.Stack)-1]
    this.MinContainer = this.MinContainer[:len(this.MinContainer)-1]
}


func (this *MinStack) Top() int {
    return this.Stack[len(this.Stack)-1]
}


func (this *MinStack) GetMin() int {
    return this.MinContainer[len(this.MinContainer)-1]
}

func min(a, b int) int {
    if a < b { return a }
    return b
}

/**
 * Your MinStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(val);
 * obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.GetMin();
 */