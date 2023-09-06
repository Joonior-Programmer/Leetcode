class Solution {
    public int calculate(String s) {
        int ret = 0;
        int op = 1;
        int temp = 0;
        Stack<Integer> stack = new Stack();
        
        for (char v : s.toCharArray()){
            if (Character.isDigit(v)) temp = temp * 10 + (v - '0');
            else if (v == '+' || v == '-'){
                ret += op * temp;
                temp = 0;
                op = v == '+' ? 1 : -1;
            } else if (v == '('){
                stack.push(ret);
                stack.push(op);
                op = 1;
                ret = 0;
            } else if (v == ')'){
                ret += op * temp;
                ret *= stack.peek();
                stack.pop();
                ret += stack.peek();
                stack.pop();
                temp = 0;
            }
        }
        
        ret += op * temp;
        return ret;
    }
}