class Solution {
    public int calculate(String s) {
        int ret = 0;
        char preOp = '+';
        int temp = 0;
        Stack<Integer> stack = new Stack();
        Stack<Character> opStack = new Stack();
        s += "+";
        
        for (char v : s.toCharArray()){
            if (Character.isDigit(v)) temp = temp * 10 + v - '0';
            else if (v == '+' || v == '-'){
                if (preOp == '+') ret += temp;
                else ret -= temp;
                temp = 0;
                preOp = v;
            } else if (v == '('){
                stack.push(ret);
                opStack.push(preOp);
                preOp = '+';
                ret = 0;
            } else if (v == ')'){
                if (preOp == '+') ret += temp;
                else ret -= temp;
                
                if (opStack.peek() == '+') ret += stack.peek();
                else ret = stack.peek() - ret;
                stack.pop();
                opStack.pop();
                temp = 0;
            }
        }
        
        return ret;
    }
}