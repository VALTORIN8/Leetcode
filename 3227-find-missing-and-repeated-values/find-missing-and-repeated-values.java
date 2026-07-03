class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int missing=0;
        int twice=0;
        int n=grid.length;
        int e=n*n;
        int sumN=(e*(e+1))/2;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    twice=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }

        int sum=0;
        for(int num : set){
            sum+=num;
        }
        missing=sumN-sum;
        int[] result=new int[2];
        result[1]=missing;
        result[0]=twice;
        return result;
    }
}