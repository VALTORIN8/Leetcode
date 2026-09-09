class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int duplicate = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = duplicate ^ nums[i];
                    break;
                }
            }
        }

        return duplicate;
    }
}