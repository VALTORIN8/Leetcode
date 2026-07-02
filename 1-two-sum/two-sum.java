class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int result[]=new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int reminder=target-nums[i];
            if(map.containsKey(reminder)){
                result[0]=map.get(reminder);
                result[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}