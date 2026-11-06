class Solution {

    public int movesToMakeZigzag(int[] nums) {
        return Math.min(calculate(nums, 0), calculate(nums, 1));
    }

    private int calculate(int[] nums, int start) {
        int n = nums.length;
        int moves = 0;

        // start = 0 -> even indices are valleys
        // start = 1 -> odd indices are valleys
        for (int i = start; i < n; i += 2) {

            int left = (i > 0) ? nums[i - 1] : Integer.MAX_VALUE;
            int right = (i < n - 1) ? nums[i + 1] : Integer.MAX_VALUE;

            int smaller = Math.min(left, right);

            if (nums[i] >= smaller) {
                moves += nums[i] - smaller + 1;
            }
        }

        return moves;
    }
}