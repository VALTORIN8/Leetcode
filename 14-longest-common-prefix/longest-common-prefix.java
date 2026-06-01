class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Sort the array - common prefix will be between first and last strings
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        // Find common prefix between first and last strings
        int i = 0;
        while (i < first.length() && i < last.length() && 
               first.charAt(i) == last.charAt(i)) {
            i++;
        }
        
        return first.substring(0, i);
    }
}