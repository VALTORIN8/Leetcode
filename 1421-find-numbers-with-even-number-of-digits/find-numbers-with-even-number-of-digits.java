class Solution {
    public int findNumbers(int[] nums){
        int count=0;
        for(int num: nums){
            if(countDigits(num)%2==0)
            count++;
        }
        return count;
        //count digit ka funcion banake?//yha ka code likho princess
    }
    public int countDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}