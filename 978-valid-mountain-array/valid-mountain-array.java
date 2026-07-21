class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;  // mountain needs at least 3 elements

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        if (index == 0 || index == n - 1) return false; // peak can't be first/last

        // check strictly increasing till peak
        for (int i = 0; i < index; i++) {
            if (arr[i] >= arr[i + 1]) return false;
        }

        // check strictly decreasing after peak
        for (int i = index; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) return false;
        }

        return true;
    }
}
