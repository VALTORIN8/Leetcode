class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int landEnd = landStartTime[i] + landDuration[i];
            

            for (int j = 0; j < m; j++) {
                int waterEnd = waterStartTime[j] + waterDuration[j];

                // Case 1: Land ride i → Water ride j
                int waterActualStart = Math.max(waterStartTime[j], landEnd);//ye ?
                int finishLW = waterActualStart + waterDuration[j];

                // Case 2: Water ride j → Land ride i
                int landActualStart = Math.max(landStartTime[i], waterEnd);
                int finishWL = landActualStart + landDuration[i];

                min = Math.min(min, Math.min(finishLW, finishWL));
            }
        }//ab ise smjna padega //ha

        return min;
    }
}