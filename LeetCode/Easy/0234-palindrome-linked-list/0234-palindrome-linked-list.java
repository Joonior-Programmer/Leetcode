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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        fast = null;
        
        while (slow != null){
            ListNode next = slow.next;
            slow.next = fast;
            fast = slow;
            slow = next;
        }
        
        while (fast != null) {
            if (fast.val != head.val) return false;
            fast = fast.next;
            head = head.next;
        }
        
        return true;
    }
}