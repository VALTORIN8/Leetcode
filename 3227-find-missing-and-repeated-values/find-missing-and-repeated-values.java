class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {//submit kr diya save h
        int n=grid.length;
        int[] result=new int[2];
        int arr[]=new int[(n*n)+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               arr[grid[i][j]]++; 
            }   
        }
        for(int i=1;i<(n*n)+1;i++){
            if(arr[i]==0){
                result[1]=i;
            }
            if(arr[i]==2){
                result[0]=i;
            }
        }
        return result;
    }
}