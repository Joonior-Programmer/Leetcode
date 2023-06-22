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
    ListNode* oddEvenList(ListNode* head) {
        if (!head || !head->next) return head;

        ListNode* oddHead = head;
        ListNode* oddTail = oddHead;
        ListNode* evenHead = head->next;
        ListNode* evenTail = evenHead;
        ListNode* curr = head->next->next;

        while (curr){
            oddTail->next = curr;
            oddTail = oddTail->next;
            curr = curr->next;

            evenTail->next = curr;
            evenTail = evenTail->next;
            curr = curr ? curr->next : NULL;
        }

        oddTail->next = evenHead;

        return oddHead;
    }
};