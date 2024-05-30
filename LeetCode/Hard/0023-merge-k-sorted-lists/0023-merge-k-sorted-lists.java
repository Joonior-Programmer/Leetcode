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
    ListNode[] lists;
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        
        this.lists = lists;
        
        return mergeHelper(0, lists.length - 1);
    }
    
    private ListNode mergeHelper(int l, int r){
        if (l == r) return lists[l];
        if (r - l == 1) return merge(lists[l], lists[r]);
        
        int mid = l + (r - l) / 2;

        ListNode l1 = mergeHelper(l, mid);
        ListNode l2 = mergeHelper(mid+1, r);
        
        return merge(l1, l2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        
        ListNode curr = dummy;
        
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }
        }
        
        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;
        
        return dummy.next;
    }
    
    // public ListNode mergeKLists(ListNode[] lists) {
        
        
    //     int[] count = new int[20001];
    //     ListNode dummy = new ListNode();
        
    //     for (ListNode curr : lists){
    //         while (curr != null){
    //             ++count[curr.val + 10000];
    //             curr = curr.next;
    //         }
    //     }
        
    //     ListNode curr = dummy;
        
    //     for (int i = 0; i < 20001; ++i) {
    //         while (count[i] > 0){
    //             curr.next = new ListNode(i - 10000);
    //             curr = curr.next;
    //             count[i]--;
    //         }
    //     }
        
    //     return dummy.next;
    // }
}