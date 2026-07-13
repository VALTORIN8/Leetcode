/*Dynamic Programming (DP) is an algorithmic technique used to solve complex problems efficiently by breaking them into smaller overlapping subproblems, solving each once, and storing the results to avoid redundant work. It’s especially powerful for optimization problems where the solution depends on combining optimal solutions of subproblems.*/

class Solution {
    public int rob(int[] nums) {
        //tu comment mei notes likh//ok
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        
        int prev2=nums[0];
        int prev1=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<n;i++){
            int current=Math.max(nums[i]+prev2,prev1);
        prev2=prev1;
        prev1=current;
        }
    return prev1;
    }
}