class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                // We are on the left side of the peak
                low = mid + 1;
            } else {
                // We are on the peak or to the right of it
                high = mid;
            }
        }
        
        // At the end, low == high, pointing to the peak index
        return low;
    }
}