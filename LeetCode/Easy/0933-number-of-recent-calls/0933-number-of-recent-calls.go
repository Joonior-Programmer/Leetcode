type RecentCounter struct {
    q *list.List
}


func Constructor() RecentCounter {
    return RecentCounter{list.New()}
}


func (this *RecentCounter) Ping(t int) int {
    this.q.PushBack(t)
    for true {
        v, _ := this.q.Front().Value.(int)
        if v + 3000 < t {
            this.q.Remove(this.q.Front())
        } else {
            break
        }
    }
    return this.q.Len()
}


/**
 * Your RecentCounter object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Ping(t);
 */