class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        ret = []
        potions.sort()
        temp_spell = sorted(spells, reverse=True)
        memo = [0] * (max(spells) + 1)
        i = 0

        for spell in temp_spell:
            if not memo[spell]:
                while i < len(potions):

                    if potions[i] * spell >= success:
                        memo[spell] = len(potions) - i
                        break
                    i += 1

        for spell in spells:
            ret.append(memo[spell])

        return ret
