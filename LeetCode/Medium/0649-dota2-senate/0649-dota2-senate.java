class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> turn = new LinkedList();
        int r = 0;
        int d = 0;
        int rSkip = 0;
        int dSkip = 0;
        
        for (char team : senate.toCharArray()) {
            if (team == 'R') ++r;
            else ++d;
            turn.offer(team);
        }
        
        while (r > 0 && d > 0){
            char temp = turn.poll();
            
            if (temp == 'R'){
                
                if (rSkip > 0){
                    rSkip--;
                    continue;
                }
                
                d--;
                ++dSkip;
                
            } else {
                
                if (dSkip > 0){
                    dSkip--;
                    continue;
                }
                
                r--;
                ++rSkip;
                
            }
            
            turn.offer(temp);
        }
        
        return r > 0 ? "Radiant" : "Dire";
    }
}