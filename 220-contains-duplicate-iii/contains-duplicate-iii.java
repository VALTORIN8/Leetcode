class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        // This is like a sorted "box" where we keep numbers.
        // It lets us search for close numbers quickly.
        TreeSet<Long> window = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            long currentNumber = nums[i];
            
            // STEP 1: Check if any number already in our box 
            // is close enough to currentNumber (difference <= valueDiff)
            
            // This finds the closest number in the box that is 
            // just "below or equal to" (currentNumber + valueDiff)
            Long closeNumber = window.floor(currentNumber + valueDiff);
            
            // If we found a number, AND it's not too small either,
            // that means it's within valueDiff of currentNumber.
            if (closeNumber != null && closeNumber >= currentNumber - valueDiff) {
                return true;  // Found a matching pair!
            }
            
            // STEP 2: No match found, so put currentNumber into the box
            // so future numbers can compare against it.
            window.add(currentNumber);
            
            // STEP 3: Keep the box size limited to "indexDiff" numbers.
            // If our box has the number that is now too far away 
            // (more than indexDiff positions back), remove it.
            if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }
        
        // We checked everything, no matching pair found
        return false;
    }
}//yhi krna hoga