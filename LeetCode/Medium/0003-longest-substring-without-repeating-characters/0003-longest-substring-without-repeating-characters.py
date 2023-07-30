class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        exist = defaultdict(bool)
        q = deque()
        ret = 0
        count = 0

        for v in s:
            if not exist[v]:
                exist[v] = True
                q.append(v)
                count += 1
                ret = max(ret, count)
            else:
                while q[0] != v:
                    exist[q.popleft()] = False
                    count -= 1
                q.append(q.popleft())

        return ret
                