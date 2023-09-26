/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/

class Solution {
public:
    Node* cloneGraph(Node* node) {
        if (!node) return node;
        
        vector<Node*> ret(101);
        vector<bool> visited(101);
        stack<Node*> turn;
        visited[1] = true;
        ret[1] = new Node(1);
        turn.push(node);
        
        while (!turn.empty()){
            Node* temp = turn.top();
            turn.pop();
            
            for (Node* neighbor : temp->neighbors){
                if (!visited[neighbor->val]){
                    visited[neighbor->val] = true;
                    ret[neighbor->val] = new Node(neighbor->val);
                    turn.push(neighbor);
                }
                ret[temp->val]->neighbors.push_back(ret[neighbor->val]);
            }
        }
        
        return ret[1];
    }
};