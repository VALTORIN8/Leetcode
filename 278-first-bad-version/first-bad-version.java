public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2; // Avoid integer overflow
            
            if (isBadVersion(mid)) {
                right = mid; // First bad could be mid or earlier
            } else {
                left = mid + 1; // First bad must be after mid
            }
        }
        
        return left;
    }
}