/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        set<ListNode*> exist;
        
        while (headA) {
            exist.insert(headA);
            headA = headA->next;
        }
        
        while (headB) {
            if (exist.find(headB) != exist.end()){
                return headB;
            }
            headB = headB->next;
        }
        
        return NULL;
    }
};