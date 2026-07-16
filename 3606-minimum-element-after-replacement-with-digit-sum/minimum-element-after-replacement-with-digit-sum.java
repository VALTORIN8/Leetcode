class Solution {
    public int minElement(int[] nums) {
//digit sum ka function bana  ke phir elemnet change?        
for(int i=0;i<nums.length;i++){
    //ha
    int sum=0;
    while(nums[i]>0){
        int digit=nums[i]%10;
        sum+=digit;
        nums[i]/=10;
    }
    nums[i]=sum;
}

        int min = Integer.MAX_VALUE;
        for(int num:nums){
    if(num<min){
        min=num;
    }
}
return min;
    }
}