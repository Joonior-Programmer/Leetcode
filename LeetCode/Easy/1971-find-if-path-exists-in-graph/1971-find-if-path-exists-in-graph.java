class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        boolean ret = false;
        
        for (int[] edge : edges) {
            int v0 = edge[0];
            int v1 = edge[1];
            graph.computeIfAbsent(v0, k -> new HashSet<>()).add(v1);
            graph.computeIfAbsent(v1, k -> new HashSet<>()).add(v0);
        }

        visited[source] = true;
        stack.push(source);
        
        while (!stack.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            
            while (!stack.isEmpty()) {
                int now = stack.pop();
                for (int v : graph.getOrDefault(now, Collections.emptySet())) {
                    if (!visited[v] && graph.getOrDefault(v, Collections.emptySet()).contains(now)) {
                        if (v == destination) {
                            return true;
                        }
                        visited[v] = true;
                        temp.add(v);
                    }
                }
            }
            
            stack.addAll(temp);
        }
        
        return false;
    }
}