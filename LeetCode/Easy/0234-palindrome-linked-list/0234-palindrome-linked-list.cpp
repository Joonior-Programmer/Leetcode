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
        vector<int> ret;
        int len = -1;
        while (head){
            ret.push_back(head->val);
            head = head->next;
            ++len;
        }
        int i = 0;
        while (i < len){
            if (ret[i] != ret[len]) return false;
            ++i;
            len--;
        }
        return true;
    }
};