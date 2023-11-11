func fib(n int) int {
    if n < 2 { return n }

    prev, curr := 0, 1
    
    for i:= 2; i < n + 1; i++ { prev, curr = curr, prev + curr }
    return curr
}