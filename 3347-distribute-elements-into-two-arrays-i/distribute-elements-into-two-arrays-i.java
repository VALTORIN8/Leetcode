class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int a = 0, b = 0;

        // First two elements
        arr1[a++] = nums[0];
        arr2[b++] = nums[1];

        // Remaining elements
        for (int i = 2; i < n; i++) {

            if (arr1[a - 1] > arr2[b - 1]) {
                arr1[a++] = nums[i];
            } else {
                arr2[b++] = nums[i];
            }
        }

        // Result = arr1 + arr2
        int[] result = new int[n];

        int k = 0;

        for (int i = 0; i < a; i++) {
            result[k++] = arr1[i];
        }

        for (int i = 0; i < b; i++) {
            result[k++] = arr2[i];
        }

        return result;
    }
}