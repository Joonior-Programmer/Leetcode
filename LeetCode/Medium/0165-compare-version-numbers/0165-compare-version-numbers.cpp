class Solution {
public:
    int compareVersion(string version1, string version2) {
        int i = 0;
        int j = 0;

        int n = version1.size();
        int m = version2.size();
        
        while (i < n || j < m){
            unsigned int v1 = 0;
            unsigned int v2 = 0;

            while (i < n && version1[i] != '.')
                v1 = v1 * 10 + version1[i++] - '0';
            

            while (j < m && version2[j] != '.')
                v2 = v2 * 10 + version2[j++] - '0';
            
            if (v1 > v2) return 1;
            else if (v2 > v1) return -1;
            
            i++;
            j++;
        }
                    
        return 0;
    }
};