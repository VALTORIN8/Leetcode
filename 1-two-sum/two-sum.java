class Solution {
    public int[] twoSum(int[] nums, int target) {//phele yhi krte h
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){//j=1?==idk//chl baad mei dekhte h
                if((nums[i]+nums[j])==target){//test cases passed
                    result[0]=i;
                    result[1]=j;// na na index hai ig//ha
                }//oye ab o(n2) se kam complexity mei 
            }
        }
        return result;
    }
}