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
    bool isPalindrome(ListNode* head) {
        ListNode* fast = head;
        ListNode* slow = head;
        while (fast && fast->next){
            fast = fast->next->next;
            slow = slow->next;
        }
        
        ListNode* next = nullptr;
        fast = NULL;
        while (slow){
            next = slow->next;
            slow->next = fast;
            fast = slow;
            slow = next;
        }
        
        while (fast) {
            if (fast->val != head->val) return false;
            fast = fast->next;
            head = head->next;
        }
        return true;
    }
};