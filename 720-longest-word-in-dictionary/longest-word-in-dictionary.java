class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words); // lexicographic sort
        HashSet<String> set = new HashSet<>();
        String result = "";

        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                if (word.length() > result.length()) {  // >= की जगह सिर्फ >
                    result = word;
                }
            }
        }

        return result;
    }
}