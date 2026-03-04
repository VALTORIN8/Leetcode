class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int result=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1&& rowsum(mat,i)==1 && colsum(mat,j)==1){
                    result++;
                }
            }
        }
        return result;
        
    }
    private int rowsum(int[][] mat, int row){
        int sum=0;
        for(int j=0;j<mat[0].length ;j++){
            sum+=mat[row][j];
        }
        return sum;
    }
    private int colsum(int[][] mat, int col){
        int sum=0;
        for(int i=0;i<mat.length ;i++){
            sum+=mat[i][col];
        }
        return sum;
    }
}
