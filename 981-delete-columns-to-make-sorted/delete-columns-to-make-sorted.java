class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int deletions = 0;
        
        for (int col = 0; col < cols; col++) {
            for (int row = 1; row < rows; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    deletions++;
                    break;  
                }
            }
        }
        
        return deletions;
    }
}
