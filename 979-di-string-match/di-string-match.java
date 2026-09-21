class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] perm=new int[n+1];
        int k=0;
        int p=n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                perm[i]=k++;
            }
            else if(s.charAt(i)=='D'){
                perm[i]=p--;
            }
        }
        perm[n]=k;
        return perm;
    }//kro princess
}