class Solution {
    public void sortColors(int[] nums) {//ye ka hua h uss sheet ki according number 9 h 
        
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            count0++;
            else if(nums[i]==1)
            count1++;
        }//ek common lena hoga
        int p=0;
        count2=nums.length-(count0+count1);
        for(int i=0;i<count0;i++){
            nums[p++]=0;
        }
        for(int i=0;i<count1;i++){
            nums[p++]=1;
        }
        for(int i=0;i<count2;i++){
            nums[p++]=2;
        }
    }
}