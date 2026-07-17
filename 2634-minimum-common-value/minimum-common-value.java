import java.util.*;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);   // <-- Fixed
        }

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        if (intersection.isEmpty()) {
            return -1;
        }

        int min = Integer.MAX_VALUE;

        for (int num : intersection) {
            min = Math.min(min, num);
        }

        return min;
    }
}