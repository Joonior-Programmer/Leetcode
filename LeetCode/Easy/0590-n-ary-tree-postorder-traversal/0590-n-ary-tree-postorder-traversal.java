/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> ret;
    
    public List<Integer> postorder(Node root) {
        ret = new ArrayList();
        
        postOrder(root);
        
        return ret;
    }
    
    private void postOrder(Node node){
        if (node == null) return;
        
        for (Node child : node.children) postOrder(child);
        
        ret.add(node.val);
    }
}