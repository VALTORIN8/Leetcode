class Solution {
    public int minMoves2(int[] nums) {
        //ig hoga ek baar dekhna plz thik
        //phele array sort
        Arrays.sort(nums);
        //phir mid element 
        int mid=nums[nums.length/2];
        int sum=0;
        //phir uski value sabse minus krke , total mei add
        for(int num : nums){
            int val=Math.abs(num-mid);//ek baar dekhna 
            sum+=val;
        }
        //return total aise kuch hoga? nhi//oki sorry plk
        return sum;
        
    }
}