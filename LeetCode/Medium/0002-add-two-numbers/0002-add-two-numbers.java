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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode();
        ListNode curr = ret;
        int currSum = 0;
        
        while (l1 != null && l2 != null){
            currSum += l1.val + l2.val;
            curr.next = new ListNode(currSum % 10);
            currSum /= 10;
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        
        while (l1 != null){
            currSum += l1.val;
            curr.next = new ListNode(currSum % 10);
            currSum /= 10;
            l1 = l1.next;
            curr = curr.next;
        }
        
        while (l2 != null){
            currSum += l2.val;
            curr.next = new ListNode(currSum % 10);
            currSum /= 10;
            l2 = l2.next;
            curr = curr.next;
        }
        
        if (currSum > 0) curr.next = new ListNode(currSum);
        
        return ret.next;
    }
}