 class Solution {
    public int findDuplicate(int[] nums) {
    
        boolean arr[]=new boolean[nums.length];//set banna tha maine hashset bana diya //ohh
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]){
                return nums[i];
            }
            else {
                arr[nums[i]]=true;
            }
            
        }
        return -1;
    }
} 
/*class Solution {//phele wala
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
}*/