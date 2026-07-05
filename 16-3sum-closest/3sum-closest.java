class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //closest sum taget-1 , taget+1 ??rang ?? are if else se kr lenge ig//oki
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){//binary search type se h solution
        if(i>0 && nums[i]==nums[i-1])continue;//jo tune kiya tha sahi tha binary search jais eh
        int left=i+1;
        int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return closest;
    }
}