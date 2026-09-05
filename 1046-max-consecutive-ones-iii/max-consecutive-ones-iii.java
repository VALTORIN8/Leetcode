
class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int CZ=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
            CZ++;
            }

            while(CZ>k){
                if(nums[left]==0){
                    CZ--;
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}