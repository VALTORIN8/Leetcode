class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //binary search se hi hoga ye//q pad rha//oki
        int n=matrix.length;
        boolean Res=false;
        int m=matrix[0].length;//func 1d array ke liye hi na? ha
    for(int i = 0; i < n; i++) {
    if(target >= matrix[i][0] && target <= matrix[i][m-1]) {
        Res= binarySearch(matrix[i], target);
    }
}
        return Res;
        
       
    }
    private boolean binarySearch(int[] arr,int target){//bool hoga ig//ook//yha 2d hi daalna hoga ig
        //toh voh seedha without function banaye hi ho jayega//ohh
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left + (right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }//yha kya?
}