class Solution {
    public boolean isPalindrome(int x) {
        
        
        if(x<0){
            return false;
        }
        int org=x;
        int reversed=0;
        while(x!=0){
            int digit=  x%10;
            reversed=reversed*10+digit;//tf//galat h?//hhehehe
            x/=10;
        }
        if(org==reversed){
            return true;
        }
        else{
            return false;
        }
    
    }
}