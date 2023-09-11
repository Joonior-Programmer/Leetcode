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
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* dummy = new ListNode();
        dummy->next = head;
        
        ListNode* slow = dummy;
        ListNode* fast = head;
        
        while (fast){
            if (fast->next && fast->val == fast->next->val){
                while (fast->next && fast->val == fast->next->val) fast->next = fast->next->next;
                fast = fast->next;
                slow->next = fast;
            } else {
                slow = slow->next;
                fast = fast->next;
            }
        }
        
        return dummy->next;
    }
};