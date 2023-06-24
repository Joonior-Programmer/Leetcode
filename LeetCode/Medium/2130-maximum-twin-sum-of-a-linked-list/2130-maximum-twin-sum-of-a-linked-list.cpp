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
    int pairSum(ListNode* head) {
        ListNode* reverse = nullptr;
        ListNode* fast = head;
        ListNode* slow = head;
        int ret = 0;


        while (fast){
            ListNode* temp = slow;
            slow = slow->next;
            fast = fast->next->next;
            temp->next = reverse;
            reverse = temp;
        }

        while (slow){
            ret = max(ret, slow->val + reverse->val);
            reverse = reverse->next;
            slow = slow->next;
        }

        return ret;
    }
};