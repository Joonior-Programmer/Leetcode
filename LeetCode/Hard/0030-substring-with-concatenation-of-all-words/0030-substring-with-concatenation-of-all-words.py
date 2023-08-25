class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        n = len(s)
        word_length = len(words[0])
        num_of_word = len(words)
        total_length = num_of_word * word_length
        ret = []

        count = Counter(words)

        for i in range(word_length):
            l = r = i
            temp_count = defaultdict(int)

            while r + word_length <= n:
                temp_word = s[r:r+word_length]
                r += word_length
                
                if temp_word in count:
                    temp_count[temp_word] += 1
                
                    while temp_count[temp_word] > count[temp_word]:
                        temp_count[s[l:l+word_length]] -= 1
                        l += word_length

                    if r - l == total_length:
                        ret.append(l)
                        temp_count[s[l:l + word_length]] -= 1
                        l += word_length
                
                else:
                    temp_count.clear()
                    l = r

        return ret