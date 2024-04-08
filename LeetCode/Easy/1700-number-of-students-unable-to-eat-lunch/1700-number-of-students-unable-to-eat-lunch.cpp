class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        vector<int> count(2);
        int n = sandwiches.size();
        
        for (int s : students) ++count[s];
            
        for (int v : sandwiches) {
            if (count[v] == 0) break;
            count[v]--;
            n--;
        }
        
        return n;
    }
};