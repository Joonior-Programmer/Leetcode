/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        unordered_map<Node*, Node*> map;
        map[nullptr] = nullptr;
        Node* curr = new Node(-1);
        Node* newHead = curr;
        while (head){
            if (map.find(head) != map.end()){
                curr->next = map[head];
            } else {
                Node* temp = new Node(head->val);
                map[head] = temp;
                curr->next = temp;
            }
            
            curr = curr->next;
            
            if (map.find(head->random) != map.end()){
                curr->random = map[head->random];
            } else {
                Node* temp = new Node(head->random->val);
                map[head->random] = temp;
                curr->random = temp;
            }
            
            head = head->next;
        }
        
        return newHead->next;
    }
};