class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        // Step 1: check for common digits
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        int common = Integer.MAX_VALUE;
        for (int num : nums2) {
            if (set.contains(num)) {
                common = Math.min(common, num);
            }
        }
        if (common != Integer.MAX_VALUE) {
            return common; // smallest common digit
        }

        // Step 2: no common digit → combine smallest from each
        int a = small(nums1);
        int b = small(nums2);
        return Math.min(a, b) * 10 + Math.max(a, b);
    }

    public int small(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}