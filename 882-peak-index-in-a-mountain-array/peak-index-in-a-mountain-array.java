class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // peak right side mein hai
                left = mid + 1;
            } else {
                // peak mid ya left side mein hai
                right = mid;
            }
        }

        // loop ke baad left == right hoga, jo peak index hai
        return left;
    }
}
