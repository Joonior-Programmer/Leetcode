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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if (left == right) return head;
        
        ListNode* dummy = new ListNode();
        dummy->next = head;
        ListNode* pre = dummy;
        
        for (int i = 1; i < left; ++i) pre = pre->next;
        
        ListNode* curr = pre->next;
        ListNode* prev = nullptr;
        
        for (int i = 0; i < right-left+1; ++i){
            ListNode* temp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = temp;
        }
        
        pre->next->next = curr;
        pre->next = prev;
        
        return dummy->next;
    }
};