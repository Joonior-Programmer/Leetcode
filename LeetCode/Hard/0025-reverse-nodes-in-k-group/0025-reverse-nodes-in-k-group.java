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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode nextPrev = dummy;
        ListNode prev = dummy;
        ListNode slow = dummy;
        ListNode fast = head;
        ListNode curr = head;
        ListNode temp = null;
        
        while (curr != null){
            int count = 1;
            
            while (curr.next != null && count < k){
                ++count;
                curr = curr.next;
            }
            
            curr = curr.next;
            
            if (count == k){
                prev = nextPrev;
                nextPrev = fast;
                while (count > 0){
                    temp = fast.next;
                    fast.next = slow;
                    slow = fast;
                    fast = temp;
                    count--;
                }
                
                prev.next.next = fast;
                prev.next = slow;
            }
        }
        
        return dummy.next;
    }
}