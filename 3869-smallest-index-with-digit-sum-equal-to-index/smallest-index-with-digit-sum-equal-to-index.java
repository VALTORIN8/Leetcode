class Solution {
    public int smallestIndex(int[] nums) {
        int result=-1;
        for(int i=0;i<nums.length;i++){
            int sum=sumOfDigits(nums[i]);
            if(sum==i){
                result=i;
                break;
            }
        }
        return result;
    }
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // extract last digit and add
            num /= 10;        // remove last digit
        }
        return sum;
    }
}