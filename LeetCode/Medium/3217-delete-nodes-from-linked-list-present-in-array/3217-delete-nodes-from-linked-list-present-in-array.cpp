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
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        vector<bool> exist(100001);
        
        ListNode* ret = new ListNode(0, head);
        ListNode* curr = ret;
        
        for (int i = 0; i < nums.size(); ++i) exist[nums[i]] = true;
        
        while (curr->next){
            if (exist[curr->next->val]) curr->next = curr->next->next;
            else curr = curr->next;
        }
        
        return ret->next;
    }
};