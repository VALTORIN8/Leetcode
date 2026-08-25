class Solution {
    public int earliestTime(int[][] tasks) {
        int result=Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            int start = tasks[i][0];   // si
            int duration = tasks[i][1]; // ti
            int finish = start + duration;

            // Keep track of the earliest finish
            result = Math.min(result, finish);
        }
        return result;
        
    }
}