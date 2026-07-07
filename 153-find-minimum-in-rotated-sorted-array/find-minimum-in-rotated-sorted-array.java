class Solution {
    public int findMin(int[] nums) {
        //bs//min elem??
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;  
            } else {
                right = mid;    
        }
    }
    return nums[left];
    }//ologn//0 ms //on hai ye //ha bs kara h phele c se usme memory kam h
}//binray search jo uss din roated mei lagya tha ajeeb sa voh!?!na simple chap de//ohh woh chap de yhi