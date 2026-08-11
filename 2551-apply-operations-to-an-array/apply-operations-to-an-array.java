class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
       
        int[] result=new int[n];
        int k=0;
        for(int num : nums){
            if(num!=0){
                result[k++]=num;
            }
        }
        for(int i=k;i<n;i++){
            result[i]=0;
        }
        return result;
    }
}