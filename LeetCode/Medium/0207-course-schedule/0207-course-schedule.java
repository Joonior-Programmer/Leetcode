class Solution {
    ArrayList<ArrayList<Integer>> req;
    HashSet<Integer> visited;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        req = new ArrayList();
        visited = new HashSet();
        
        for (int i = 0; i < numCourses; ++i) req.add(new ArrayList());
        
        for (int i = 0; i < prerequisites.length; ++i)
            req.get(prerequisites[i][0]).add(prerequisites[i][1]);
        
        for (int i = 0; i < numCourses; ++i) 
            if (!dfs(i)) return false;
        
        return true;
    }
    
    private boolean dfs(int course){
        if (visited.contains(course)) return false;
        if (req.get(course).size() == 0) return true;
        
        visited.add(course);
        
        for (int i = 0; i < req.get(course).size(); ++i){
            if (!dfs(req.get(course).get(i))) return false;
        }
        
        visited.remove(course);
        req.set(course, new ArrayList());
        
        return true;
    }
}