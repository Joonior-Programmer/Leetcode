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
    public ListNode modifiedList(int[] nums, ListNode head) {
        boolean[] exist = new boolean[100001];
        
        ListNode ret = new ListNode(0, head);
        ListNode curr = ret;
        
        for (int i = 0; i < nums.length; ++i) exist[nums[i]] = true;
        
        while (curr.next != null){
            if (exist[curr.next.val]) curr.next = curr.next.next;
            else curr = curr.next;
        }
        
        return ret.next;
    }
}