# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def spiralMatrix(self, m: int, n: int, head: Optional[ListNode]) -> List[List[int]]:
        ret = [[-1] * n for i in range(m)]
        
        row = 0
        col = 0
        
        row_start = 0
        col_start = 0
        
        while head:
            while head and col < n:
                ret[row][col] = head.val
                head = head.next
                col += 1
            
            n -= 1
            row += 1
            col -= 1

            while head and row < m:
                ret[row][col] = head.val
                head = head.next
                row += 1
            
            m -= 1
            row -= 1
            col -= 1

            while head and col > col_start - 1:
                ret[row][col] = head.val
                head = head.next
                col -= 1
            
            col_start += 1
            col += 1
            row -= 1
            
            while head and row > row_start:
                ret[row][col] = head.val
                head = head.next
                row -= 1
            
            row_start += 1
            row += 1
            col += 1
        
        return ret

def format_output(result):
    return '[' + ','.join(str(row).replace(' ', '') for row in result) + ']'

def kdsmain():
    input_data = sys.stdin.read().strip()
    lines = input_data.splitlines()
    
    num_test_cases = len(lines) // 3
    results = []

    for i in range(num_test_cases):
        m = int(lines[i*3])
        n = int(lines[i*3 + 1])
        head_values = json.loads(lines[i*3 + 2])
        
        if not head_values:
            head = None
        else:
            head = ListNode(head_values[0])
            current = head
            for value in head_values[1:]:
                current.next = ListNode(value)
                current = current.next
        
        result = Solution().spiralMatrix(m, n, head)
        formatted_result = format_output(result)
        results.append(formatted_result)

    with open('user.out', 'w') as f:
        for result in results:
            f.write(f"{result}\n")

if __name__ == "__main__":
    kdsmain()
    exit(0)