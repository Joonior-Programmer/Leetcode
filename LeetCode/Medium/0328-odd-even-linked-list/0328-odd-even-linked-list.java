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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode oddHead = head;
        ListNode oddTail = oddHead;
        ListNode evenHead = head.next;
        ListNode evenTail = evenHead;
        ListNode curr = head.next.next;

        while (curr != null){
            oddTail.next = curr;
            oddTail = oddTail.next;
            curr = curr.next;

            if (curr != null){
                evenTail.next = curr;
                evenTail = evenTail.next;
                curr = curr.next;
            }
        }

        oddTail.next = evenHead;
        evenTail.next = null;

        return oddHead;
    }
}