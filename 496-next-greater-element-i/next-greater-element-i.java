class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      //hash table se?
       int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int currnum=nums1[i];
            int indx=-1;
            int nxtbig=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==currnum){
                    indx=j;
                    break;
                }
            }
            for(int m=indx+1;m<nums2.length;m++){
                if(nums2[m]>currnum){
                    nxtbig=nums2[m];
                    break;
                }
            }
            result[i]=nxtbig;
           } 
       
return result;
    }
}