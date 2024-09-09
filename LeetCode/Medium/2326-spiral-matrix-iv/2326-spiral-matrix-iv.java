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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ret = new int[m][n];
        
        int row = 0;
        int col = 0;
        
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j) ret[i][j] = -1;

        int row_start = 0;
        int col_start = 0;
        
        while (row_start < m && col < n){
            while (head != null &&col < n){
                ret[row][col++] = head.val;
                head = head.next;
            }
            
            n--;
            row++;
            col--;
            
            while (head != null && row < m){
                ret[row++][col] = head.val;
                head = head.next;
            }
            
            m--;
            row--;
            col--;

            while (head != null && col > col_start - 1){
                ret[row][col--] = head.val;
                head = head.next;
            }
            
            col_start++;
            col++;
            row--;
            
            while (head != null && row > row_start){
                ret[row--][col] = head.val;
                head = head.next;
            }
            
            row_start++;
            row++;
            col++;
        }
        
        return ret;
    }
}