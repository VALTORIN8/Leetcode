class Solution {
    public int minCapability(int[] nums, int k) {
        
           int low = Integer.MAX_VALUE; 
       int high = Integer.MIN_VALUE;
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        } 
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(can(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
            return ans;
    }

    private boolean can(int[] nums, int k, int capability) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= capability) {
                count++;
                i++; // Skip the next house to ensure non-adjacency
            }
            if (count >= k) {
                return true;
            }
        }
        return false;
    
}
}