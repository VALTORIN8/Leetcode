 class Solution {
    public int findDuplicate(int[] nums) {
    //set jaise hi h ye
        boolean arr[]=new boolean[nums.length];//set banna tha maine hashset bana diya //ohh
        for(int num : nums){
            if(arr[num]){
                return num;
            }
            else {
                arr[num]=true;
            }
            
        }
        return -1;
    }
} 
