class Solution {
    public boolean isIsomorphic(String s, String t) {

        // Arrays to store the last seen position of each character
        int[] mapS = new int[256]; // For characters in s
        int[] mapT = new int[256]; // For characters in t

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i); // Current character in s
            char b = t.charAt(i); // Corresponding character in t

            // Check if this character has been seen before
            // If last seen positions are different, mapping is broken → not isomorphic
            if (mapS[a] != mapT[b]) {
                return false;
            }

            // Update the last seen position of both characters
            // Use i + 1 because 0 means "not seen yet"
            mapS[a] = i + 1;
            mapT[b] = i + 1;
        }

        // All characters match properly → strings are isomorphic
        return true;
    }
}