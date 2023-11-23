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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        
        ListNode curr = dummy;
        
        while (head != null){
            if (head.next != null){
                ListNode temp = head.next.next;
                curr.next = head.next;
                curr.next.next = head;
                curr.next.next.next = null;
                head = temp;
            } else {
                curr.next = head;
                head = null;
            }
            curr = curr.next.next;
        }
        
        return dummy.next;
    }
}