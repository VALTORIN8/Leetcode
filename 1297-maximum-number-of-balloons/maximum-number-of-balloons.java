class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int balonCount[] = new int[5];
        
        for (int i = 0; i < n; i++) {
            // Fix 1: Use Character.toLowerCase() for primitive chars
            char c = Character.toLowerCase(text.charAt(i)); 
            
            if (c == 'b') balonCount[0]++;
            if (c == 'a') balonCount[1]++;
            if (c == 'l') balonCount[2]++;
            if (c == 'o') balonCount[3]++;
            if (c == 'n') balonCount[4]++;
        }
        
        // Fix 2: Remove Math.floor(). Integer division automatically rounds down.
        balonCount[2] = balonCount[2] / 2;
        balonCount[3] = balonCount[3] / 2;
        
        // Find the minimum value in the array
        int min = balonCount[0];
        for (int i = 0; i < 5; i++) {
            if (min > balonCount[i]) {
                min = balonCount[i];
            }
        }
        return min;
    }
}
