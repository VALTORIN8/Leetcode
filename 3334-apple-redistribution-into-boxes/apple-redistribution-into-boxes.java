class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        //sab apple ka sum
        //capacity ko sort
        //phir sum apple mei se capacity backward traverese krte krte value minus jab tak sum<0 nhi hota?ig capacity ko sort krk ulta chale to?//ha vhi toh bola lol
       
        int sum=0;
        for(int fruit:apple){
            sum+=fruit;
        }
        int result=0;
        Arrays.sort(capacity);
        int n=capacity.length;
        for(int i=n-1;i>=0 && sum>0;i--){
            sum-=capacity[i];
            result++;
          
        }
        return result;
    }
}