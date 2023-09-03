class Solution {
public:
    string simplifyPath(string path) {
        vector<string> ret;
        
        size_t start = 0;
        size_t end = path.find('/');
        
        while (end != string::npos) {
            string dir = path.substr(start, end - start);
            
            if (!dir.empty() && dir != "." && dir != "..") {
                ret.push_back(dir);
            } else if (dir == ".." && !ret.empty()) {
                ret.pop_back();
            }
            
            start = end + 1;
            end = path.find('/', start);
        }
        
        string lastDir = path.substr(start);
        if (!lastDir.empty() && lastDir != "." && lastDir != "..") {
            ret.push_back(lastDir);
        } else if (lastDir == ".." && !ret.empty()) {
            ret.pop_back();
        }
        
        string result = "/";
        
        for (int i = 0; i < ret.size(); ++i) {
            result += ret[i] + "/";
        }
        
        if (result.length() > 1) {
            result.pop_back();
        }
        
        return result;
    }
};