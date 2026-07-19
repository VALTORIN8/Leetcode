class Solution {
    public boolean isSubsequence(String s, String t) {
      //t ko traverse krke s ke elemnts check krenge?//ok
       //dp bhi likha h isme or 2 pointers   //kuch time saving sochte hai
       //2 point
               int i=0;
       int j=0;
       while(i<s.length()&&j<t.length()){
      if(s.charAt(i)==t.charAt(j)){
            i++;
        j++;
        }
       else{
        j++;
       }
       }
       return i==s.length();
       
       
    }
}