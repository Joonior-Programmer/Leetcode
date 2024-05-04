class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int l = 0;
        int r = people.length - 1;
        int ret = 0;
        
        while (r >= l) {
            if (people[l] + people[r] <= limit) ++l;
            r--;
            ++ret;
        }
        
        return ret;
    }
}