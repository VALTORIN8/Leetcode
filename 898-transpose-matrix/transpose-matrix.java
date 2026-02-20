class Solution {
    public int[][] transpose(int[][] arr) {
        int n=arr.length;
    int m=arr[0].length;
    
    int[][] arr1=new int[m][n];
     for (int i=0;i<m;i++){             //replace loops from i to j and
        for (int j=0;j<n;j++){
            arr1[i][j]=arr[j][i];
        }
        System.out.println();
    }
    return arr1;
    }
}