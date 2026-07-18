
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        
        // Normalize: lowercase + replace punctuation with spaces
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        
        String result = "";
        int maxCount = 0;
        
        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) continue;
            
            int freq = count.getOrDefault(word, 0) + 1;
            count.put(word, freq);
            
            if (freq > maxCount) {
                maxCount = freq;
                result = word;
            }
        }
        
        return result;
    }
}