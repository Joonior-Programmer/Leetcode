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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        
        ListNode slowest = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null){
            slowest = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slowest.next = slow.next;
        
        return head;
    }
}