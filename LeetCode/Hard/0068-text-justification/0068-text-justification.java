class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ret = new ArrayList();
        int l = 0, r = 0, curr = 0, n = words.length;
        
        StringBuilder sb = new StringBuilder();
        
        while (r < n){
            if (curr + words[r].length() <= maxWidth) curr += words[r++].length() + 1;
            else {
                if (l + 1 == r){
                    sb.append(words[l]);
                    sb.append(" ".repeat(maxWidth - curr + 1));
                } else {
                    int numOfWords = r - l;
                    int spaceNeeded = maxWidth - curr + numOfWords;
                    int spaceEach = spaceNeeded / (numOfWords - 1);
                    int extraSpace = spaceNeeded % (numOfWords - 1);

                    for (int i = l; i < r - 1; ++i){
                        sb.append(words[i]);
                        sb.append(" ".repeat(spaceEach));
                        
                        if (extraSpace > 0) {
                            sb.append(" ");
                            extraSpace--;
                        }
                    }
                    
                    sb.append(words[r-1]);
                }

                ret.add(sb.toString());
                sb.setLength(0);
                l = r;
                curr = words[r++].length() + 1;
            }
        }
        
        sb.append(words[l]);
        
        for (int i = l + 1; i < r; ++i) {
            sb.append(" ");
            sb.append(words[i]);
        }

        sb.append(" ".repeat(maxWidth - curr + 1));
        ret.add(sb.toString());

        return ret;
    }
}