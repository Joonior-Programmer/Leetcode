class Solution:
    def compress(self, chars: List[str]) -> int:
        prev = chars[0]
        prev_count = 1
        idx = 0
        
        for v in chars[1:]:
            if v == prev:
                prev_count += 1
            else:
                chars[idx] = prev
                idx += 1
                if prev_count != 1:
                    for num in str(prev_count):
                        chars[idx] = num
                        idx += 1
                prev = v
                prev_count = 1

        chars[idx] = prev
        idx += 1

        if prev_count != 1:
            for v in str(prev_count):
                chars[idx] = v
                idx += 1

        return idx
        