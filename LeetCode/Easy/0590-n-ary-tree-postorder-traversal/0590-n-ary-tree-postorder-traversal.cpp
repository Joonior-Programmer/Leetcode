/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<int> postorder(Node* root) {
        vector<int> ret;
        
        postOrder(root, ret);
        
        return ret;
    }
    
    void postOrder(Node* node, vector<int>& ret){
        if (!node) return;
        
        for (Node* child : node->children) postOrder(child, ret);
        
        ret.push_back(node->val);
    }
};