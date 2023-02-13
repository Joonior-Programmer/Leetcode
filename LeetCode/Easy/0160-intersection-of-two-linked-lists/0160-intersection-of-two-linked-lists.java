/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> exist = new HashSet<>();
        
//         while (headA != null) {
//             exist.add(headA);
//             headA = headA.next;
//         }
        
//         while (headB != null) {
//             if (exist.contains(headB)){
//                 return headB;
//             }
//             headB = headB.next;
//         }
        
//         return null;
//     }
        
        int lenA = 0;
        int lenB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        
        while (curA != null) {
            ++lenA;
            curA = curA.next;
        }
        
        while (curB != null) {
            ++lenB;
            curB = curB.next;
        }
        
        if (lenA > lenB){
            while (lenA > lenB) {
                headA = headA.next;
                ++lenB;
            }
        } else if (lenB > lenA) {
            while (lenB > lenA) {
                headB = headB.next;
                ++lenA;
            }
        }
        
        while (headA != null && headB != null){
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
}