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
    ListNode* swapPairs(ListNode* head) {
        ListNode* dummy = new ListNode();
        
        ListNode* curr = dummy;
        
        while (head){
            if (head->next){
                ListNode* temp = head->next->next;
                curr->next = head->next;
                curr->next->next = head;
                curr->next->next->next = nullptr;
                head = temp;
            } else {
                curr->next = head;
                head = nullptr;
            }
            curr = curr->next->next;
        }
        
        return dummy->next;
    }
};