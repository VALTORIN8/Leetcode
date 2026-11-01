import java.util.*;

class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {

        int already = 0;
        int best = 0;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                already++;
            } 
            else {
                int a = Math.min(nums[i], nums[i + 1]);
                int b = Math.max(nums[i], nums[i + 1]);

                String key = a + "," + b;

                int count = map.getOrDefault(key, 0) + 1;

                map.put(key, count);

                best = Math.max(best, count);
            }
        }

        return already + best;
    }
}