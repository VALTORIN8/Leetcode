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