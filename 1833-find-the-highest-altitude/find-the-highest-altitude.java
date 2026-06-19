class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitude = new int[n + 1];   // n+1 points
        altitude[0] = 0;
        for (int i = 1; i <= n; i++) {       // go all the way to n
            altitude[i] = gain[i - 1] + altitude[i - 1];
        }
        int highest = altitude[0];
        for (int i = 0; i <= n; i++) {
            if (altitude[i] > highest) {
                highest = altitude[i];
            }
        }
        return highest;
    }
}