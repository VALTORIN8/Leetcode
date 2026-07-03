class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i<n ;i++){
            nums1[i+m]=nums2[i];
        }
        
        
        for (int i = 0; i < nums1.length - 1; i++) {
            // After each pass, largest element moves to the end
            for (int j = 0; j < nums1.length - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
        
        
    }
}