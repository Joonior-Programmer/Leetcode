class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        Stack<Integer> repeat = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int rp = 0;
        for (char v : s.toCharArray()){
            if (Character.isDigit(v)) rp = rp * 10 + (v - '0');
            else if (v == '[') {
                stack.push(cur);
                repeat.push(rp);
                rp = 0;
                cur = new StringBuilder();
            } else if (v == ']') {
                StringBuilder temp = stack.pop();
                temp.append(cur.toString().repeat(repeat.pop()));
                cur = temp;
            }
            else cur.append(v);
        }

        return cur.toString();
    }
}