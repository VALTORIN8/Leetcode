class Solution {
    public boolean checkOnesSegment(String s) {
        // "0 ke baad 1 aaya" = second segment = false
        boolean seenZeroAfterOne = false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                seenZeroAfterOne = true;  // 0 mil gaya
            } else {
                // s.charAt(i) == '1'
                if (seenZeroAfterOne) {
                    return false;  // 0 ke baad 1 aaya = two segments!
                }
            }
        }
        return true;
    }
}