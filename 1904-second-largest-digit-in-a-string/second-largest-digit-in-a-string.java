class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();//krna code try
        //set mei digits string se kaise add hongi?//if se eleminate ig
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'){
                set.add( c - '0');//ho gya
            }//ho gya 
        }
        int max=-1;
        for(int x: set){
            if(x>max){
                max=x;
            }
        }
        int result=-1;
        for(int x: set){
            if((x>result) && (x!=max)){
                result=x;
            }
        }//princess sabse phele wala for ech loop glt h run krke dekh 
        return result;//-1 bhi hoga

    }
}