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
//         set<ListNode*> exist;
        
//         while (headA) {
//             exist.insert(headA);
//             headA = headA->next;
//         }
        
//         while (headB) {
//             if (exist.find(headB) != exist.end()){
//                 return headB;
//             }
//             headB = headB->next;
//         }
        
//         return NULL;
        int lenA = 0;
        int lenB = 0;
        ListNode* curA = headA;
        ListNode* curB = headB;
        
        while (curA){
            ++lenA;
            curA = curA->next;
        }
        
        while (curB){
            ++lenB;
            curB = curB->next;
        }
        
        if(lenA > lenB){
            while (lenA > lenB){
                headA = headA->next;
                lenB++;
            }
        } else if (lenB > lenA){
            while (lenB > lenA){
                headB = headB->next;
                lenA++;
            }
        }
        
        while (headA && headB) {
            if (headA == headB){
                return headA;
            }
            headA = headA->next;
            headB = headB->next;
        }
        
        return NULL;
    }
};