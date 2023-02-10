/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> checkExist = new HashSet<>();
        ListNode curr = head;
        while (curr != null){
            if (checkExist.contains(curr)){
                return true;
            }
            checkExist.add(curr);
            curr = curr.next;
        }
        return false;
    }
}