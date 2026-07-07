class Solution {
    public long sumAndMultiply(int n) {
        long original=n;
        long sum=0;//isme sum kr
        long num=0;//isme digit bana
        while(n!=0){
            long digit=n%10;
            if(digit != 0){
                num=num*10+digit;
                sum=sum+digit;
            }
            n=n/10;
            
        }
        long reversed=0;
        while(num>0){
            long digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
    
        long result=sum*reversed;
        return result;
    }//long use krna hoga ig
    
    
    
}