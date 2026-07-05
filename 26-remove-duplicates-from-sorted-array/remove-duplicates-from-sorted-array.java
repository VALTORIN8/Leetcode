class Solution {
    public int removeDuplicates(int[] nums) {//return kya krna h?? index??
        int count=0;//ye
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
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