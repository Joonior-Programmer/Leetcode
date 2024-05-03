class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;

        int n = version1.length();
        int m = version2.length();

        char[] v1CharArray = version1.toCharArray();
        char[] v2CharArray = version2.toCharArray();
        
        while (i < n || j < m){
            int v1 = 0;
            int v2 = 0;

            while (i < n && v1CharArray[i] != '.')
                v1 = v1 * 10 + v1CharArray[i++] - '0';
            

            while (j < m && v2CharArray[j] != '.')
                v2 = v2 * 10 + v2CharArray[j++] - '0';
            
            if (v1 > v2) return 1;
            else if (v2 > v1) return -1;
            
            i++;
            j++;
        }
                    
        return 0;
    }
}