import java.util.*;

class Solution {
    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs, (a, b) -> {
            return (a[1] - a[0]) - (b[1] - b[0]);
        });

        int n = costs.length;
        int total = 0;

        for (int i = 0; i < n; i++) {

            if (i < n / 2) {
                total += costs[i][1]; // City B
            } else {
                total += costs[i][0]; // City A
            }
        }

        return total;
    }
}