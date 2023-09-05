class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> operators = new HashSet();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        Stack<Integer> stack = new Stack();
        
        for (String v : tokens){
            if (operators.contains(v)){
                int back = stack.peek();
                stack.pop();
                int front = stack.peek();
                stack.pop();
                if (v.equals("+")) stack.push(front + back);
                else if (v.equals("-")) stack.push(front - back);
                else if (v.equals("*")) stack.push(front * back);
                else stack.push(front / back);
            } else stack.push(Integer.valueOf(v));
        }
        
        return stack.peek();
    }
}