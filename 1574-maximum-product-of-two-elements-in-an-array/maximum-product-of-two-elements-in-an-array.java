class Solution {
    public int maxProduct(int[] nums) {
       //array sort // product of last 2?//yhi hoga // ha ba ha ha ha ha ha ha ha ha ha ha ha //ok
       Arrays.sort(nums);
       int n=nums.length;
       int max=(nums[n-1]-1)*(nums[n-2]-1);
       return max;
  //tup nana na na   
    }
}