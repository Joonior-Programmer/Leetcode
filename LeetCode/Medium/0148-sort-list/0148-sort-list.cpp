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
    ListNode* sortList(ListNode* head) {
        vector<int> count(200001);
        ListNode* curr = head;
        
        while (curr){
            ++count[curr->val+100000];
            curr = curr->next;
        }
        
        curr = head;
        
        for (int i = 0; i < 200001; ++i){
            while (count[i] > 0){
                count[i]--;
                curr->val = i - 100000;
                curr = curr->next;
            }
        }
        
        return head;
    }
};