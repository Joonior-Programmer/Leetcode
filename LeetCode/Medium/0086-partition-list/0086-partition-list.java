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
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode();
        ListNode bigDummy = new ListNode();
        ListNode smallDummyHead = smallDummy;
        ListNode bigDummyHead = bigDummy;
        
        while (head != null){
            if (head.val < x){
                smallDummy.next = head;
                smallDummy = head;
            } else {
                bigDummy.next = head;
                bigDummy = head;
            }
            head = head.next;
        }
        
        smallDummy.next = bigDummyHead.next;
        bigDummy.next = null;
        
        return smallDummyHead.next;
    }
}