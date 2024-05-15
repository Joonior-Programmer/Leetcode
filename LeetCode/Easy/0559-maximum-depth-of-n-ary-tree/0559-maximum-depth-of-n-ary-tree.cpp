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
    int maxDepth(Node* root) {
        if (!root) return 0;
        
        return dfs(root, 0);
    }
    
    int dfs(Node* node, int curr){
        ++curr;
        int ret = curr;
        
        for (Node* v : node->children) ret = max(ret, dfs(v, curr));
        
        return ret;
    }
};