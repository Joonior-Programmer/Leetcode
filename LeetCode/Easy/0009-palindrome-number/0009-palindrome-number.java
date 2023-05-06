class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0) return false;
        int c=0;
        while (x>c){
            c=c*10+x%10;
            x=x/10;
            
        }

         if(x==c)return true ;
         if(c/10==x) return true; 

        return false;
    }
}