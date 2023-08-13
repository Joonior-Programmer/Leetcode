type RandomizedSet struct {
    mapper map[int]int
    vals []int
}


func Constructor() RandomizedSet {
    return RandomizedSet{make(map[int]int), make([]int, 0)}
}


func (this *RandomizedSet) Insert(val int) bool {
    if _, ok := this.mapper[val]; ok { return false }

    this.mapper[val] = len(this.vals)
    this.vals = append(this.vals, val)
    
    return true
}


func (this *RandomizedSet) Remove(val int) bool {
    if _, ok := this.mapper[val]; !ok { return false }
    
    idx := this.mapper[val]
    length := len(this.vals) - 1


    this.vals[idx] = this.vals[length]
    this.mapper[this.vals[idx]] = idx
    this.vals = this.vals[:length]
    delete(this.mapper, val)

    return true
}


func (this *RandomizedSet) GetRandom() int {
    return this.vals[rand.Intn(len(this.vals))]
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Insert(val);
 * param_2 := obj.Remove(val);
 * param_3 := obj.GetRandom();
 */