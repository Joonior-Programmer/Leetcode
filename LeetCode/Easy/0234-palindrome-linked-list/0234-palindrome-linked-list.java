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
        ArrayList<Integer> ret = new ArrayList<>();
        int len = -1;
        while(head != null){
            ret.add(head.val);
            head = head.next;
            ++len;
        }
        int i = 0;
        while (i < len){
            if (ret.get(i) != ret.get(len)) return false;
            ++i;
            len--;
        }
        return true;
    }
}