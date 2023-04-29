class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int result = 0;
        for (int i = 0; i < tasks.length;){
            int j = i + 1;
            while (j < tasks.length && tasks[i] == tasks[j]) j++;
            if (j == i + 1) return -1;
            result += (j - i + 2) / 3;
            i = j;
        }
        return result;
    }
}