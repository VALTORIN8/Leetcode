class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for (int n = num1; n <= num2; n++) {
            total += waviness(n);
        }
        return total;
    }

    private int waviness(int n) {
        String s = Integer.toString(n);
        int count = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            int prev = s.charAt(i - 1) - '0';
            int curr = s.charAt(i)     - '0';
            int next = s.charAt(i + 1) - '0';
            if (curr > prev && curr > next) count++; // peak
            else if (curr < prev && curr < next) count++; // valley
        }
        return count;
    }
}