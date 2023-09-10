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
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* dummy = new ListNode();
        dummy->next = head;
        
        ListNode* nextPrev = dummy;
        ListNode* prev = dummy;
        ListNode* slow = dummy;
        ListNode* fast = head;
        ListNode* curr = head;
        ListNode* temp = nullptr;
        
        while (curr){
            int count = 1;
            
            while (curr->next && count < k){
                ++count;
                curr = curr->next;
            }
            
            curr = curr->next;
            
            if (count == k){
                prev = nextPrev;
                nextPrev = fast;
                while (count > 0){
                    temp = fast->next;
                    fast->next = slow;
                    slow = fast;
                    fast = temp;
                    count--;
                }
                
                prev->next->next = fast;
                prev->next = slow;
            }
        }
        
        return dummy->next;
    }
};