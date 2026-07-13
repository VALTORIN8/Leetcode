/*Dynamic Programming (DP) is an algorithmic technique used to solve complex problems efficiently by breaking them into smaller overlapping subproblems, solving each once, and storing the results to avoid redundant work. It’s especially powerful for optimization problems where the solution depends on combining optimal solutions of subproblems.*/

class Solution {
    public int rob(int[] nums) {
        //tu comment mei notes likh//ok
        int n=nums.length;
        if(n==0)return 0;//no house skip
        if(n==1)return nums[0];//one house usse hi chori
        
        int prev2=nums[0];//1st element
        int prev1=Math.max(nums[0],nums[1]);//greatest btw phele 2
 
        for(int i=2;i<n;i++){//this describes choices that either rob or skip 
        //if nums[i]+prev2 is bigger than prev1 which is sum than we update sum 
            int current=Math.max(nums[i]+prev2,prev1);
        prev2=prev1;//update prev1 and prev2
        prev1=current;
        }
        //like sliding window
    return prev1;
    }
}