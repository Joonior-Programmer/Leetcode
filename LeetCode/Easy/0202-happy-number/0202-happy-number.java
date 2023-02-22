class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        while (n != 1){
            if (visited.contains(n)){
                return false;
            }
            visited.add(n);
            int temp = 0;
            int tempN = n;
            while (tempN != 0){
                temp += (tempN % 10) * (tempN % 10);
                tempN /= 10;
            }
            n = temp;
        }
        return true;
    }
}