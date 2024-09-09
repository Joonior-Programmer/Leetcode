/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> spiralMatrix(int m, int n, ListNode* head) {
        ios::sync_with_stdio(false);
        cin.tie(0);
        cout.tie(0);
        
        vector<vector<int>> ret(m, vector<int>(n, -1));
        
        int row = 0;
        int col = 0;

        int row_start = 0;
        int col_start = 0;
        
        while (row_start < m && col < n){
            while (head &&col < n){
                ret[row][col++] = head->val;
                head = head->next;
            }
            
            n--;
            row++;
            col--;
            
            while (head && row < m){
                ret[row++][col] = head->val;
                head = head->next;
            }
            
            m--;
            row--;
            col--;

            while (head && col > col_start - 1){
                ret[row][col--] = head->val;
                head = head->next;
            }
            
            col_start++;
            col++;
            row--;
            
            while (head && row > row_start){
                ret[row--][col] = head->val;
                head = head->next;
            }
            
            row_start++;
            row++;
            col++;
        }
        
        return ret;
    }
};