class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int dist1 = 0;
        int dist2 = 0;

        // start -> destination
        for (int i = start; i != destination; i = (i + 1) % distance.length) {
            dist1 += distance[i];
        }

        // destination -> start
        for (int i = destination; i != start; i = (i + 1) % distance.length) {
            dist2 += distance[i];
        }

        return Math.min(dist1, dist2);
    }
}