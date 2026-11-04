class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        for (char c : s.toCharArray()) {
            String b = Integer.toBinaryString(c);

            while (b.length() < 8) {
                b = "0" + b;
            }

            binary.append(b);
        }

        String original = binary.toString();
        String reverse = binary.reverse().toString();

        return original.equals(reverse);
    }
}