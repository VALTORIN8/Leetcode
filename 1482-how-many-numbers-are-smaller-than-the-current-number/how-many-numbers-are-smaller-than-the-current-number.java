class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=0;
            for(int j=0; j<n; j++){
                if(nums[j]<nums[i]){
                    array[i]++;
                }
            }
        }
        return array;
        
    }
}