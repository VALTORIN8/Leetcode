class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        // Step 1: Calculate total sum
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        
        // Step 2: If not divisible by 3, impossible
        if (total % 3 != 0) {
            return false;
        }
        
        // Step 3: Find 2 partition points with target sum
        int target = total / 3;
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
            
            if (sum == target) {
                count++;      // Found one partition point
                sum = 0;      // Reset for next segment
            }
            
            if (count == 2) {
                return true;  // Found 2 cuts = 3 parts with equal sum
            }
        }
        
        return false;
    }
}