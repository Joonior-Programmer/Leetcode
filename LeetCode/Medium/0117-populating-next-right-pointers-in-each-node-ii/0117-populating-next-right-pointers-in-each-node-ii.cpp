/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* left;
    Node* right;
    Node* next;

    Node() : val(0), left(NULL), right(NULL), next(NULL) {}

    Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

    Node(int _val, Node* _left, Node* _right, Node* _next)
        : val(_val), left(_left), right(_right), next(_next) {}
};
*/

class Solution {
public:
    Node* connect(Node* root) {
        Node* dummy = new Node();
        Node* temp = dummy;
        Node* ret = root;
        
        while (root){
            if (root->left){
                temp->next = root->left;
                temp = temp->next;
            }
            
            if (root->right){
                temp->next = root->right;
                temp = temp->next;
            }
            
            root = root->next;
            
            if (!root){
                root = dummy->next;
                dummy->next = nullptr;
                temp = dummy;
            }
        }
        
        return ret;
    }
};