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
    public int pairSum(ListNode head) {
        ListNode reverse = null;
        ListNode fast = head;
        ListNode slow = head;
        int ret = 0;


        while (fast != null){
            ListNode temp = slow;
            slow = slow.next;
            fast = fast.next.next;
            temp.next = reverse;
            reverse = temp;
        }

        while (slow != null){
            ret = Math.max(ret, slow.val + reverse.val);
            reverse = reverse.next;
            slow = slow.next;
        }

        return ret;
    }
}