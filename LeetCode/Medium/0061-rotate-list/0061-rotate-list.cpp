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
    ListNode* rotateRight(ListNode* head, int k) {
        ListNode* dummy = new ListNode();
        dummy->next = head;
        
        int len = 0;
        
        ListNode* curr = head;
        
        while (curr){
            curr = curr->next;
            ++len;
        }
        
        if (!len) return head;
        
        k %= len;
        
        if (!k) return head;
        
        ListNode* slow = dummy;
        ListNode* fast = head;
        
        while (k < len){
            slow = slow->next;
            fast = fast->next;
            ++k;
        }
        
        dummy->next = fast;
        slow->next = nullptr;
        
        while (fast->next) fast = fast->next;
        
        fast->next = head;
        
        return dummy->next;
    }
};