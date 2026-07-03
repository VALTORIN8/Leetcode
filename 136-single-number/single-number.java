class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }//ise sumbit krk dekh

        return ans;
    }
}