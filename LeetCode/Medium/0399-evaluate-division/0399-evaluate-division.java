class Solution {
    HashMap<String, HashMap<String, Double>> map;
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        map = createMap(equations, values);
        double[] ret = new double[queries.size()];
        
        for (int i = 0; i < queries.size(); ++i){
            String x = queries.get(i).get(0);
            String y = queries.get(i).get(1);
            if (!map.containsKey(x) || !map.containsKey(y)) ret[i] = -1;
            else if (x == y) ret[i] = 1;
            else {
                double value = DFS(x, y, new HashSet<String>());
                if (value != -1){
                    map.get(x).put(y, value);
                    map.get(y).put(x, 1 / value);
                }
                ret[i] = value;
            }
        }
        return ret;
    }
    
    private HashMap<String, HashMap<String, Double>> createMap(List<List<String>> equations, double[] values){
        HashMap<String, HashMap<String, Double>> map = new HashMap();
        
        for (int i = 0; i < equations.size(); ++i){
            String x = equations.get(i).get(0);
            String y = equations.get(i).get(1);
            
            if (map.containsKey(x)) map.get(x).put(y, values[i]);
            else {
                HashMap<String, Double> temp = new HashMap();
                temp.put(y, values[i]);
                map.put(x, temp);
            }
            
            if (map.containsKey(y)) map.get(y).put(x, 1 / values[i]);
            else {
                HashMap<String, Double> temp = new HashMap();
                temp.put(x, 1 / values[i]);
                map.put(y, temp);
            }
        }
        
        return map;
    }
    
    private double DFS(String node, String target, HashSet<String> visited){
        if (map.containsKey(node) && map.get(node).containsKey(target)) return map.get(node).get(target);
        
        HashMap<String, Double> route = map.get(node);
        
        visited.add(node);
        
        double ret = -1.0;
        
        for (String key : route.keySet()){
            if (!visited.contains(key)){
                ret = DFS(key, target, visited);
                
                if (ret != -1.0){
                    ret *= map.get(node).get(key);
                    route.put(target, ret);
                    map.get(target).put(node, 1 / ret);
                    break;
                }
            }
        }
        return ret;
    }
}