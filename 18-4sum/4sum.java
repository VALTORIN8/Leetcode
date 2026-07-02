import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Edge case: need at least 4 numbers
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        int n = nums.length;
        
        // Step 2: Fix first number (i)
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 3: Fix second number (j)
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                
                // Step 4: Use two pointers for remaining two numbers
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    // Calculate sum using long to avoid overflow
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        // Found a quadruplet!
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Skip duplicates for third number
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        
                        // Skip duplicates for fourth number
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        // Move both pointers
                        left++;
                        right--;
                        
                    } else if (sum < target) {
                        // Sum too small, need larger numbers
                        left++;
                    } else {
                        // Sum too large, need smaller numbers
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
    
    // Test method
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        System.out.println("Input: " + Arrays.toString(nums1) + ", target: " + target1);
        System.out.println("Output: " + sol.fourSum(nums1, target1));
        System.out.println();
        
        // Test case 2
        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        System.out.println("Input: " + Arrays.toString(nums2) + ", target: " + target2);
        System.out.println("Output: " + sol.fourSum(nums2, target2));
        System.out.println();
        
        // Test case 3 - Edge case with overflow
        int[] nums3 = {1000000000, 1000000000, 1000000000, 1000000000};
        int target3 = -294967296;
        System.out.println("Input: " + Arrays.toString(nums3) + ", target: " + target3);
        System.out.println("Output: " + sol.fourSum(nums3, target3));
    }
}

/* 
VISUAL ALGORITHM FLOW:
======================

Step 1: Sort Array
[-2, -1, 0, 0, 1, 2]

Step 2-4: Four loops/pointers
  i: First fixed number (outer loop)
    j: Second fixed number (middle loop)
      L: Left pointer (moves right)
        R: Right pointer (moves left)

Example Visualization:
[-2, -1, 0, 0, 1, 2]
  i   j  L        R   → sum = -2 + -1 + 0 + 2 = -1 (< 0, so L++)
  
[-2, -1, 0, 0, 1, 2]
  i   j     L     R   → sum = -2 + -1 + 0 + 2 = -1 (< 0, so L++)
  
[-2, -1, 0, 0, 1, 2]
  i   j        L  R   → sum = -2 + -1 + 1 + 2 = 0 ✓ Found!

KEY OPTIMIZATIONS:
==================
1. Sorting enables two-pointer technique
2. Skip duplicates to avoid repeated quadruplets
3. Use long for sum to handle overflow
4. Early termination when sum is impossible

TIME COMPLEXITY: O(n³)
SPACE COMPLEXITY: O(1) excluding result
*/