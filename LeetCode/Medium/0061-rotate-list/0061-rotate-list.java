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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        int len = 0;
        
        ListNode curr = head;
        
        while (curr != null) {
            curr = curr.next;
            ++len;
        }
        
        if (len == 0) return head;
        
        k %= len;
        
        if (k == 0) return head;

        ListNode slow = dummy;
        ListNode fast = head;

        while (k < len){
            slow = slow.next;
            fast = fast.next;
            ++k;
        }

        dummy.next = fast;
        slow.next = null;

        while (fast.next != null) fast = fast.next;
        fast.next = head;

        return dummy.next;
    }
}