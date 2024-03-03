class Solution {
    public String interpret(String command) {
        StringBuilder ret = new StringBuilder();
        char prev = 'a';
        
        for (int i = 0; i < command.length(); ++i){
            char temp = command.charAt(i);
            if (temp == 'G') ret.append('G');
            else if (temp == ')'){
                if (prev == 'l') ret.append("al");
                else if (prev == '(') ret.append('o');
            }
            
            prev = temp;
        }
        
        return ret.toString();
    }
}