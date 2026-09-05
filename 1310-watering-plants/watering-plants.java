class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int sum = 0;
        int water = capacity;

        for (int i = 0; i < plants.length; i++) {

            if (capacity >= plants[i]) {
                sum++;
                capacity -= plants[i];
            } 
            else {
                sum += 2 * i;
                capacity = water;
                capacity -= plants[i];
                sum++;
            }
        }

        return sum;
    }
}