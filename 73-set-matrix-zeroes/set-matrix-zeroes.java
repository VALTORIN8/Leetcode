class Solution {
    public void setZeroes(int[][] matrix) {
        //step 1: 2 for loop se row and collumn ko note krenge and use hashset me store krenge 
        HashSet<Integer> rowid=new HashSet<>();
        HashSet<Integer> columnid=new HashSet<>();
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rowid.add(i);//add?
                    columnid.add(j);
                }
        }
        }
    
        //}
  for (int i : rowid) {
    for (int j = 0; j < n; j++) {
        matrix[i][j] = 0;
    }
}

for (int j : columnid) {
    for (int i = 0; i < m; i++) {
        matrix[i][j] = 0;
    }
}
    }
}