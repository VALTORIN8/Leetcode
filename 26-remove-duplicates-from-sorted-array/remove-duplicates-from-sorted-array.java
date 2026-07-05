class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;//ye
        Set<Integer> set = new HashSet<>();//time jyada liya hmm sirf hash set use kre to
        for(int i=0;i<nums.length;i++){//3ms??
            if(set.contains(nums[i])){//vaise set insert order maintain nhi krta ye linkedseth ye krta h no need 
                continue;
            }
            else{
                set.add(nums[i]);
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}