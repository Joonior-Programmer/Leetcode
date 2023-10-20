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
    vector<ListNode*> lists;
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if (lists.size() == 0) return nullptr;
        
        this->lists = lists;
        
        return mergeHelper(0, lists.size() - 1);
    }
    
    ListNode* mergeHelper(int l, int r){
        if (l == r) return lists[l];
        if (r - l == 1) return merge(lists[l], lists[r]);
        
        int mid = l + (r - l) / 2;
        
        ListNode* l1 = mergeHelper(l, mid - 1);
        ListNode* l2 = mergeHelper(mid, r);
        
        return merge(l1, l2);
    }
    
    ListNode* merge(ListNode* l1, ListNode* l2){
        ListNode* dummy = new ListNode();
        
        ListNode* curr = dummy;
        while (l1 && l2){
            if (l1->val < l2->val){
                curr->next = l1;
                l1 = l1->next;
                curr = curr->next;
            } else {
                curr->next = l2;
                l2 = l2->next;
                curr = curr->next;
            }
        }
        
        if (l1) curr->next = l1;
        if (l2) curr->next = l2;
        
        return dummy->next;
    }
};