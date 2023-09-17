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
    ListNode* partition(ListNode* head, int x) {
        ListNode* smallDummy = new ListNode();
        ListNode* bigDummy = new ListNode();
        ListNode* smallDummyHead = smallDummy;
        ListNode* bigDummyHead = bigDummy;
        
        while (head){
            if (head->val < x){
                smallDummy->next = head;
                smallDummy = head;
            } else {
                bigDummy->next = head;
                bigDummy = head;
            }
            head = head->next;
        }
        
        smallDummy->next = bigDummyHead->next;
        bigDummy->next = nullptr;
        
        return smallDummyHead->next;
    }
};