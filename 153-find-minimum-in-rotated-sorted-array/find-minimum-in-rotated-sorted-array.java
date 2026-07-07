class Solution {
    public int findMin(int[] nums) {
        //bs//min elem??
        int min=nums[0];
        for(int num : nums){
            if(num<min){
                min=num;
            }
        }
        return min;
    }//ologn
}//binray search jo uss din roated mei lagya tha ajeeb sa voh!?!na simple chap de