class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                upperCount++;
            }
        }
        
       
        return upperCount == word.length() || 
               upperCount == 0 || 
               (upperCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }
}