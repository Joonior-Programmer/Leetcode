class Solution {
public:
    int idx = 0;
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<int> ret(numCourses);
        vector<vector<int>> req(numCourses);
        
        for (int i = 0; i < numCourses; ++i) req[i] = vector<int>(0);
        
        for (int i = 0; i < prerequisites.size(); ++i) req[prerequisites[i][1]].push_back( prerequisites[i][0]);
        
        vector<bool> added(numCourses, false);
        vector<bool> visited(numCourses, false);
        
        for (int i = 0; i < numCourses; ++i)
            if (!dfs(i, req, added, visited, ret)) return vector<int>(0);
        
        reverse(ret.begin(), ret.end());
        return ret;
    }
    
    bool dfs(int course, vector<vector<int>>& req, vector<bool>& added, vector<bool>& visited, vector<int>& ret){
        if (visited[course]) return false;
        if (req[course].size() == 0){
            if (!added[course]){
                added[course] = true;
                ret[idx++] = course;
            }
            return true;
        }
        
        visited[course] = true;
        
        for (int i = 0; i < req[course].size(); ++i)
            if (!dfs(req[course][i], req, added, visited, ret)) return false; 
        
        visited[course] = false;
        added[course] = true;
        ret[idx++] = course;
        req[course] = vector<int>{};
        
        return true;
    }
};