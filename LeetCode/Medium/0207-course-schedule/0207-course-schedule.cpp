class Solution {
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
        vector<vector<int>> req(numCourses);
        unordered_set<int> visited;
        
        for (int i = 0; i < prerequisites.size(); ++i)
            req[prerequisites[i][0]].push_back(prerequisites[i][1]);
        
        for (int i = 0; i < numCourses; ++i)
            if (!dfs(i, req, visited)) return false;
        
        return true;
    }
    
    bool dfs(int course, vector<vector<int>>& req, unordered_set<int>& visited){
        if (visited.find(course) != visited.end()) return false;
        if (req[course].size() == 0) return true;
        
        visited.insert(course);
        
        for (int i = 0; i < req[course].size(); ++i)
            if (!dfs(req[course][i], req, visited)) return false;
        
        visited.erase(course);
        req[course] = vector<int>(0);
        return true;
    }
};