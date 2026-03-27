class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<m ;i++){
            for(int j=0 ; j<n; j++){
                int val=matrix[i][j];
                boolean rowmin=true;
                for(int k=0;k<n;k++){
                    if(matrix[i][k]<val){
                        rowmin=false;//rowmin ki value?bool hai//oki✅
                        break;
                    }//same colmin kr to me aaya✅
                }
                boolean colmax=true;
                for(int k=0;k<m;k++){
                    if(matrix[k][j]>val){
                        colmax=false;
                        break;//sahi h? col max ka tha ha
                    }
                }
                if(rowmin&&colmax){
                    result.add(val);
                }
                
            }
        }
        return result;
        
    }
}