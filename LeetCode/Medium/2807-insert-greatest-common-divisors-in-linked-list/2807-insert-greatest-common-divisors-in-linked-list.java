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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        
        while (curr.next != null){
            ListNode tempNode = new ListNode(gcd(curr.val, curr.next.val), curr.next);
            curr.next = tempNode;
            curr = curr.next.next;
        }
        
        return head;
    }
    
    private int gcd(int a, int b){
        int remainder = a % b;
        if (remainder > 0) return gcd(b, remainder);
        return b;
    }
}