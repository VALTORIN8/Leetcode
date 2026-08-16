class Solution {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                // Minimum is on the right
                l = mid + 1;
            }
            else if (nums[mid] < nums[r]) {
                // Minimum is at mid or on the left
                r = mid;
            }
            else {
                // nums[mid] == nums[r]
                // Can't determine the side
                r--;
            }
        }

        return nums[l];
    }
}