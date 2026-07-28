import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n / 4;
        
        // Map store karega: Element -> Frequency
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : arr) {
            // Har number ka count update karein
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            
            // Check karein agar count 25% se zyada ho gaya hai
            if (counts.get(num) > threshold) {
                return num;
            }
        }

        return -1;
    }
}