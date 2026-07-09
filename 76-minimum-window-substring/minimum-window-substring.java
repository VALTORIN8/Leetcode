class Solution {
    public String minWindow(String s, String t) {

        // Agar t bada hai to answer impossible
        if (s.length() < t.length())
            return "";

        // Frequency of characters needed
        HashMap<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // Current window frequency
        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;

        // Kitne unique characters satisfy hue
        int formed = 0;

        // Total unique characters needed
        int required = need.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // Add current character
            window.put(c, window.getOrDefault(c, 0) + 1);

            // Requirement complete hui?
            if (need.containsKey(c) &&
                window.get(c).intValue() == need.get(c).intValue()) {

                formed++;
            }

            // Window valid hai
            while (formed == required) {

                // Answer update
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Left character remove
                char ch = s.charAt(left);

                window.put(ch, window.get(ch) - 1);

                // Requirement toot gayi?
                if (need.containsKey(ch) &&
                    window.get(ch) < need.get(ch)) {

                    formed--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLen);
    }
}