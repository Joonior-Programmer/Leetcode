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
    public ListNode doubleIt(ListNode head) {
        if (head.val > 4) head = new ListNode(0, head);
        
        ListNode curr = head;
        
        while (curr != null){
            curr.val = curr.val * 2 % 10;
            
            if (curr.next != null && curr.next.val > 4) ++curr.val;
            curr = curr.next;
        }
        
        return head;
    }
}