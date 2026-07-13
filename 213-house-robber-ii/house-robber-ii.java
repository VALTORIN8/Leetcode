class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
     
        int sum1=robbery(nums,0,nums.length-2);
        int sum2=robbery(nums,1,nums.length-1);
        return sum1>sum2?sum1:sum2;
    }
    public int robbery(int[] nums,int start,int end){
        
    
        int prev2=0;
        int prev1=0;
        boolean firsttaken=true;
        boolean lasttaken=true;
        if(prev1!=nums[0]){
            firsttaken=false;
        }
        for(int i=start;i<=end;i++){
            int current=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}