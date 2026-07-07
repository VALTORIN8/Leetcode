class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;      // number of rows
        int n = matrix[0].length;   // number of columns
        
        // Step 1: Create two arrays to mark rows and columns
        boolean[] rows = new boolean[m];  // track which rows have zeros
        boolean[] cols = new boolean[n];  // track which columns have zeros
        
        // Step 2: First pass - Find all zeros and mark
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;  // mark row i
                    cols[j] = true;  // mark column j
                }
            }//ye?
        }//phele submit kara tah  ye
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}