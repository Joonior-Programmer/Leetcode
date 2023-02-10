/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

#include <set>

class Solution {
public:
    bool hasCycle(ListNode *head) {
        set<ListNode*> checkExist;
        ListNode* curr = head;
        while (curr) {
            if (checkExist.find(curr) != checkExist.end()){
                return true;
            }
            checkExist.insert(curr);
            curr = curr->next;
        }
        return false;
    }
};