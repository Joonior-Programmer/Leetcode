class Solution {
    int[] ret;
    boolean[] visited;
    boolean[] added;
    ArrayList<ArrayList<Integer>> req;
    int idx;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        idx = 0;
        ret = new int[numCourses];
        req = new ArrayList();
        
        for (int i = 0; i < numCourses; ++i) req.add(new ArrayList());
        
        for (int i = 0; i < prerequisites.length; ++i) req.get(prerequisites[i][1]).add(prerequisites[i][0]);
        
        visited = new boolean[numCourses];
        added = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; ++i)
            if (!dfs(i)) return new int[0];
        
        int left = 0;
        int right = numCourses - 1;
        
        while (left < right){
            int temp = ret[left];
            ret[left++] = ret[right];
            ret[right--] = temp;
        }
        
        return ret;
    }
    
    private boolean dfs(int course){
        if (visited[course]) return false;
        if (req.get(course).size() == 0){
            if (!added[course]){
                added[course] = true;
                ret[idx++] = course;
            }
            return true;
        }
        
        visited[course] = true;
        
        for (int v : req.get(course))
            if (!dfs(v)) return false;
        
        visited[course] = false;
        added[course] = true;
        ret[idx++] = course;
        req.set(course, new ArrayList());
        return true;
    }
}