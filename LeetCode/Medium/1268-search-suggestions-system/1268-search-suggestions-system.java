class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        int n = products.length;
        List<List<String>> ret = new ArrayList();
        int l = 0, r = n - 1;
        char[] word = searchWord.toCharArray();
        
        Arrays.sort(products);
        
        for (int i = 0; i < word.length; ++i){
            while (l <= r && (i >= products[l].length() || products[l].charAt(i) != word[i])) ++l;
            while (l <= r && (i >= products[r].length() || products[r].charAt(i) != word[i])) r--;
            
            List<String> temp = new ArrayList();
            
            int j = l;
            int end = Math.min(l+3, r+1);

            while (j < end){
                temp.add(products[j++]);
            }
            ret.add(temp);
        }
        
        return ret;
    }
}