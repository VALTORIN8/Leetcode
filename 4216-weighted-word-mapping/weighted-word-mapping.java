class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for (String w : words) {
            int sum = 0;
            for (char c : w.toCharArray()) sum += weights[c - 'a'];
            res += (char)('z' - (sum % 26));
        }
        return res;
    }
}
/* class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        String result = "";

        for (int i = 0; i < words.length; i++) {
            int sum = 0;

            for (int j = 0; j < words[i].length(); j++) {

                char ch = words[i].charAt(j); // use words[i] and j
                int index = ch - 'a';

                sum += weights[index];
            }

            result += (char) ('z' - (sum % 26));
        }

        return result;
    }
} */