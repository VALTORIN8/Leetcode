class Solution {
    public int reverseDegree(String s) {
        int result=0;
        
        for(int i=0;i<s.length();i++){
            //char ka number? wht??//jiase a ka 26 h
            char ch = s.charAt(i);
            int index = 'z' - ch + 1;
            result+=index*(i+1);
        }
        return result;
    }
}//vaps vapaas mera code 