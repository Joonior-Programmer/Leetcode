class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        keyboard = [set(["q","w","e","r","t","y","u","i","o","p","Q","W","E","R","T","Y","U","I","O","P"]),
        set(["a","s","d","f","g","h","j","k","l","A","S","D","F","G","H","J","K","L"]),
        set(["z","x","c","v","b","n","m","Z","X","C","V","B","N","M"])]
        ret = []
        for word in words:
            temp = 0 if word[0] in keyboard[0] else 1 if word[0] in keyboard[1] else 2
            is_one_line = True
            for v in word:
                if v not in keyboard[temp]:
                    is_one_line = False
                    break
            if is_one_line:
                ret.append(word)

        return ret