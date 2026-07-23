class Solution {
    public double average(int[] salary) {
        int max=salary[0];//easy h ye
        int min=salary[0];
        for(int x : salary){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        double average=0.0;
        for(int x : salary){
            if(x!=max && x!=min){
                average+=x;
            }
        }
        double result=average/(salary.length-2);
        return result;
    }
}
    