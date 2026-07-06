class Solution {
    public int firstMissingPositive(int[] nums) {
        //create hashset
        Set<Integer> set= new HashSet<>();
        //add all elements
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        //smallest positve number not in set//start with 1 check till set length
        for(int i=0;i<nums.length+1;i++){
            if(!set.contains(i+1)){
                return i+1;
            }
        }
        return 1;
    }
}