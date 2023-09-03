class Solution {
    public String simplifyPath(String path) {
        ArrayList<String> ret = new ArrayList();
        
        for (String dir : path.split("/")){
            if (!dir.equals("..") && !dir.equals(".") && dir.length() > 0) ret.add(dir);
            else if (dir.equals("..") && ret.size() > 0) ret.remove(ret.size()-1);
        }
        
        StringBuilder result = new StringBuilder();
        result.append("/");
        
        for (int i = 0; i < ret.size(); ++i) {
            result.append(ret.get(i));
            result.append("/");
        }
        
        if (result.length() > 1) result.deleteCharAt(result.length() - 1);
        
        return result.toString();
    }
}