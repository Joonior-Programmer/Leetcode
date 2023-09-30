class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        int ret = 1;
        int idx = 0;
        ArrayList<String> stack = new ArrayList();
        stack.add(startGene);
        boolean[] used = new boolean[bank.length];
        
        while (stack.size() > idx){
            int end = stack.size();
            for (int i = idx; i < end; ++i){
                String curr = stack.get(i);
                
                for (int j = 0; j < bank.length; ++j){
                    if (used[j]) continue;

                    int count = 0;

                    for (int k = 0; k < 8; ++k){
                        if (curr.charAt(k) != bank[j].charAt(k)) ++count;
                    }

                    if (count == 1) {
                        if (bank[j].equals(endGene)) return ret;
                        used[j] = true;
                        stack.add(bank[j]);
                    }
                }
            }
            idx = end;
            ++ret;
        }
        
        return -1;
    }
}