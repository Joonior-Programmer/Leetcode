class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        int n = sandwiches.length;
        
        for (int s : students) ++count[s];
            
        for (int v : sandwiches) {
            if (count[v] == 0) break;
            count[v]--;
            n--;
        }
        
        return n;
    }
}