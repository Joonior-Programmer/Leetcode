class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> stack = new LinkedList<>();
        boolean condition;
        for (int v : asteroids){
            condition = true;
            while (stack.size() > 0 && v < 0 && stack.getLast() > 0){
                if (stack.getLast() < -v) {
                    stack.removeLast();
                    continue;
                }
                else if (stack.getLast() == -v) {
                    stack.removeLast();
                }
                condition = false;
                break;
            } 
            if (condition) stack.addLast(v);
        }

        return stack.stream().mapToInt(i->i).toArray();
    }
}