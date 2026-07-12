class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        double sum=0.0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];//sum
        }
        max=sum;//max =sum/n !? y k?//are pehle ek slide then baki slide ki compare//ok
        double m2=0;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];//dekh to shi hai?//ig i=k se nhi hona chhaiye!?//yha
            //dekhte hai
            max=Math.max(sum,max);//sb shi to lg rha
        }
        return max/k;
    }//mistake dundhni hogi//kiya kya thoda explain
}//1 2 3 4 5 k=2
//max=1.5
