class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int z=n/2;
        int[] pos=new int[z];
        int[] neg=new int[z];
        int k=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[k++]=nums[i];
            }
            else{
                neg[j++]=nums[i];
            }
        }
        int o=0;
        int m=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[o++];
            }
            else{
                nums[i]=neg[m++];
            }
        }
        return nums;
    }
}