class Solution {
    public int buyChoco(int[] prices, int money) {
      //sabse kam price wali 2 chocolate leni h?//ek meri or dusari princess's best friend ki ok? ok ji
       Arrays.sort(prices);
       int sum=prices[0]+prices[1];
       int result=0;
       if(sum<=money){
           result= money-sum; 
       }
       else{
           result=money; 
       }
       return result;       //pgl hai kya leftover return krna hai//oh okhmm //aise
    }
}