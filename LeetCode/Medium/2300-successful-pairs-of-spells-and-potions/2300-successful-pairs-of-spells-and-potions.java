class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ret = new int[spells.length];
        Arrays.sort(potions);
        int spell = 0;

        for (int i = 0; i < spells.length; ++i) spell = Math.max(spell, spells[i]);

        int[] memo = new int[spell + 1];
        int i = 0;
        
        while (spell > 0){
            while (i < potions.length){
                if ((double)potions[i] * spell >= success) break;
                ++i;
            }
            memo[spell--] = potions.length - i;
        }
        
        for (int j = 0; j < spells.length; ++j) {
            ret[j] = memo[spells[j]];
        }
        
        return ret;
    }
}