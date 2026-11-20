
class Solution {
    public int secondHighest(String s) {

        int max = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                int num = ch - '0';

                if (num > max) {
                    second = max;
                    max = num;
                }
                else if (num < max && num > second) {
                    second = num;
                }
            }
        }

        return second;
    }
}