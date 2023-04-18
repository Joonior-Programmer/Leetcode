class Solution {
    public String[] findWords(String[] words) {
        int[] keyboard = {1,0,0,1,2,1,1,1,2,1,1,1,0,0,2,2,2,2,1,2,2,0,2,0,2,0};
        String[] ret = new String[0];
        int first; 
        int second;
        int third;
        char[] temp;
        for (int i = 0; i < words.length; ++i){
            first = 0;
            second = 0;
            third = 0;
            temp = words[i].toCharArray();
            for (int j = 0; j < temp.length; ++j){
                if (keyboard[Character.toUpperCase(temp[j]) - 'A'] == 0) ++first;
                else break;
            }

            if (first == temp.length) {
                ret = Arrays.copyOf(ret, ret.length + 1);
                ret[ret.length - 1] = new String(temp);
                continue;
            }

            for (int j = 0; j < temp.length; ++j){
                if (keyboard[Character.toUpperCase(temp[j]) - 'A'] == 1) ++second;
                else break;
            }

            if (second == temp.length) {
                ret = Arrays.copyOf(ret, ret.length + 1);
                ret[ret.length - 1] = new String(temp);
                continue;
            }

            for (int j = 0; j < temp.length; ++j){
                if (keyboard[Character.toUpperCase(temp[j]) - 'A'] == 2) ++third;
                else break;
            }

            if (third == temp.length) {
                ret = Arrays.copyOf(ret, ret.length + 1);
                ret[ret.length - 1] = new String(temp);
            }
        }
        return ret;
    }
}