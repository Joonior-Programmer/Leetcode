/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;
        
        while (curr != null){
            ++n;
            curr = curr.next;
        }
        
        curr = head;
        ListNode[] ret = new ListNode[k];
        int need = n / k;
        int remain = n % k;
        
        for (int i = 0; i < k; ++i){
            ListNode temp = curr;
            int count = need;
            
            if (remain > 0) {
                remain--;
                ++count;
            }
            
            for (int j = 0; j < count - 1; ++j){
                if (curr == null) break;
                curr = curr.next;
            }
            
            if (curr != null){
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }

            ret[i] = temp;
        }
        
        return ret;
    }
}