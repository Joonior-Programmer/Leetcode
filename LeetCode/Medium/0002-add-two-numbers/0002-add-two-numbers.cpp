/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* ret = new ListNode();
        ListNode* curr = ret;
        int currSum = 0;
        
        
        while (l1 && l2){
            currSum += l1->val + l2->val;
            curr->next = new ListNode(currSum % 10);
            currSum /= 10;
            
            l1 = l1->next;
            l2 = l2->next;
            curr = curr->next;
        }
        
        while (l1){
            currSum += l1->val;
            curr->next = new ListNode(currSum % 10);
            currSum /= 10;
            
            l1 = l1->next;
            curr = curr->next;
        }
        
        while (l2){
            currSum += l2->val;
            curr->next = new ListNode(currSum % 10);
            currSum /= 10;
            
            l2 = l2->next;
            curr = curr->next;
        }
        
        if (currSum) curr->next = new ListNode(currSum);
        
        return ret->next;
    }
};