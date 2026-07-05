class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int currentarea=0;
            int width=right-left;
            int Height=Math.min(height[left],height[right]);//yha
            currentarea=width*Height;//out of bounds ja rha
            maxarea=Math.max(currentarea,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}