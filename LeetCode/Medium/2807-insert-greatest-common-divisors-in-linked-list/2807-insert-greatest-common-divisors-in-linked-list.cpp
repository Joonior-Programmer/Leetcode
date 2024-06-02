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
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        ListNode* curr = head;
        
        while (curr->next){
            ListNode* tempNode = new ListNode(gcd(curr->val, curr->next->val), curr->next);
            curr->next = tempNode;
            curr = curr->next->next;
        }
        
        return head;
    }
    
    int gcd(int a, int b){
        int remainder = a % b;
        if (remainder > 0) return gcd(b, remainder);
        return b;
    }
};