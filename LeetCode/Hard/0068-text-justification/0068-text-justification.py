class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        ret = []
        left, right = 0, 0
        curr = 0
        n = len(words)
        
        while right < n:
            if len(words[right]) + curr <= maxWidth:
                curr += len(words[right]) + 1
                right += 1
            else:
                temp = ""
                if left + 1 == right:
                    temp += words[left] + " " * (maxWidth - curr + 1)
                else:
                    num_of_words = right - left
                    curr -= num_of_words
                    space_needed = maxWidth - curr
                    each_space = space_needed // (num_of_words - 1)
                    extra_space = space_needed % (num_of_words - 1)

                    for i in range(left, right - 1):
                        temp += words[i] + " " * each_space
                        if extra_space:
                            temp += " "
                            extra_space -= 1
                    temp += words[right-1]

                ret.append(temp)

                left = right
                curr = len(words[right]) + 1

                right += 1
        
        temp = words[left]

        for i in range(left + 1, right):
            temp += " " + words[i]

        temp += " " * (maxWidth - len(temp))

        ret.append(temp)

        return ret