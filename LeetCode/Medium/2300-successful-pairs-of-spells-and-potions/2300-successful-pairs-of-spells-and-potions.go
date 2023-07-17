func successfulPairs(spells []int, potions []int, success int64) []int {
    ret := make([]int, len(spells))
    spell := 0

    for i := 0; i < len(spells); i++ {
        if spells[i] > spell { spell = spells[i] }
    }

    memo := make([]int, spell + 1)
    sort.Ints(potions)
    i := 0

    for spell > 0 {
        for i < len(potions) {
            if int64(potions[i]) * int64(spell) >= success { break }
            i++
        }
        memo[spell] = len(potions) - i
        spell--
    }

    for j := 0; j < len(spells); j++ { ret[j] = memo[spells[j]] }

    return ret
}