class Solution {
public:
    string interpret(string command) {
        string ret = "";
        char prev = 'a';
        
        for (int i = 0; i < command.size(); ++i){
            char temp = command[i];
            if (temp == 'G') ret += 'G';
            else if (temp == ')'){
                if (prev == 'l') ret += "al";
                else if (prev == '(') ret += 'o';
            }
            
            prev = temp;
        }
        
        return ret;
    }
};