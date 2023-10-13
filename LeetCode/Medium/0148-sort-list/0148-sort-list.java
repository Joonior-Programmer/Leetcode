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
    public ListNode sortList(ListNode head) {
        int[] count = new int[200001];
        ListNode curr = head;
        
        while (curr != null){
            count[curr.val + 100000]++;
            curr = curr.next;
        }
        
        curr = head;
        
        for (int i = 0; i < 200001; ++i){
            while (count[i] > 0) {
                count[i]--;
                curr.val = i - 100000;
                curr = curr.next;
            }

        }
        
        return head;
    }
}