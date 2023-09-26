/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return node;
        
        Node[] ret = new Node[101];
        boolean[] visited = new boolean[101];
        Stack<Node> stack = new Stack();
        ret[1] = new Node(node.val);
        stack.push(node);
        
        while (!stack.empty()){
            Node temp = stack.peek();
            stack.pop();
            
            for (Node neighbor : temp.neighbors){
                if (!visited[neighbor.val]){
                    visited[neighbor.val] = true;
                    ret[neighbor.val] = new Node(neighbor.val);
                    stack.push(neighbor);
                }
                ret[temp.val].neighbors.add(ret[neighbor.val]);
            }
        }
        
        return ret[1];
    }
}