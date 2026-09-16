class Solution {
    public int maxFreqSum(String s) {
        
        Map<Character, Integer> vowelFreq = new HashMap<>();
        Map<Character, Integer> consonantFreq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    // Vowel
                    vowelFreq.put(ch, vowelFreq.getOrDefault(ch, 0) + 1);
                } else {
                    // Consonant
                    consonantFreq.put(ch, consonantFreq.getOrDefault(ch, 0) + 1);
                }
            }
        }
        int maxVowel = 0;
        for (int freq : vowelFreq.values()) {
            maxVowel = Math.max(maxVowel, freq);
        }
        int maxConsonant = 0;
        for (int freq : consonantFreq.values()) {
            maxConsonant = Math.max(maxConsonant, freq);
        }

        int sum = maxVowel + maxConsonant;
        return sum;//ho gya princess
    }
}