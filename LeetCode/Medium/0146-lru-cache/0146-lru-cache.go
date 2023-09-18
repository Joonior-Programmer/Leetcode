type LRUCache struct {
    capacity int
    size int
    data []int
    skip []int
    lru *list.List
}


func Constructor(capacity int) LRUCache {
    data := make([]int, 10001)
    for i := 0; i < 10001; i++ { data[i] = -1 }
    return LRUCache{capacity, 0, data, make([]int, 10001), list.New()}
}


func (this *LRUCache) Get(key int) int {
    if this.data[key] == -1 { return -1 }

    this.skip[key]++
    this.lru.PushFront(key)

    return this.data[key]
}


func (this *LRUCache) Put(key int, value int)  {
    if this.data[key] == -1 { this.size++ }

    this.data[key] = value
    this.skip[key]++
    this.lru.PushFront(key)

    if this.size > this.capacity {
        for this.skip[this.lru.Back().Value.(int)] != 1 {
            this.skip[this.lru.Back().Value.(int)]--
            this.lru.Remove(this.lru.Back())
        }

        temp := this.lru.Back().Value.(int)
        this.lru.Remove(this.lru.Back())
        this.skip[temp]--
        this.data[temp] = -1
        this.size--
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * obj := Constructor(capacity);
 * param_1 := obj.Get(key);
 * obj.Put(key,value);
 */