class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int duplicate=0;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                duplicate=nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return duplicate;
        
    }
}