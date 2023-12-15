class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> s = new HashMap();
        String ret = paths.get(0).get(0);

        for (List<String> v : paths)
            s.put(v.get(0), v.get(1));
            
        while (s.containsKey(ret))
            ret = s.get(ret);
        
        return ret;
    }
}