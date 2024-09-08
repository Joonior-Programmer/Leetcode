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
    vector<ListNode*> splitListToParts(ListNode* head, int k) {
        int n = 0;
        ListNode* curr = head;
        
        while (curr){
            ++n;
            curr = curr->next;
        }
        
        curr = head;
        
        vector<ListNode*> ret(k);
        
        int need = n / k;
        int remain = n % k;
        
        for (int i = 0; i < k; ++i){
            ListNode* temp = curr;
            int count = need;
            
            if (remain > 0) {
                remain--;
                ++count;
            }
            
            for (int j = 0; j < count - 1; ++j){
                if (!curr) break;
                curr = curr->next;
            }
            
            if (curr){
                ListNode* next = curr->next;
                curr->next = nullptr;
                curr = next;
            }

            ret[i] = temp;
        }
        
        return ret;
    }
};