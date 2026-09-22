class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        // chars ke frequency store karo
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (String word : words) {
            HashMap<Character, Integer> temp = new HashMap<>();
            boolean possible = true;

            for (char c : word.toCharArray()) {
                temp.put(c, temp.getOrDefault(c, 0) + 1);

                if (!map.containsKey(c) || temp.get(c) > map.get(c)) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                ans += word.length();
            }
        }

        return ans;
    }
}