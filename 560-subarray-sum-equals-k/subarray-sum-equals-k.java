class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: one way to have sum 0
        int tillsum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            tillsum += nums[i];

            // check if (tillsum - k) exists
            if (map.containsKey(tillsum - k)) {
                count += map.get(tillsum - k);
            }

            // update frequency of tillsum
            map.put(tillsum, map.getOrDefault(tillsum, 0) + 1);
        }

        return count;
    }
}

/* import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1; // subarray from 0..i  ////ha ye leetcode sahi mei pagal karega 
            }//same code hai

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // store first occurrence of sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
} */