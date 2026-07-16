class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Frequency count approach - Best approach!
        int freq[] = new int[26];
     
        // 1. Magazine ke characters count karo
        for (char c : magazine.toCharArray()) {   // Corrected 'A'
            freq[c - 'a']++;
        }
        
        // 2. RansomNote ke characters check karo
        for (char c : ransomNote.toCharArray()) { // Corrected 'A'
            freq[c - 'a']--;
            
            // Agar kisi character ka count 0 se kam hua, matlab magazine mein nahi tha
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}