class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if(n==1){
            
        return 0;
        }

        int inc = 0;
        int dec = 0;

        for (int i = 0; i < n - 1; i++) {

            if (nums[i] > nums[i + 1])
                inc++;

            if (nums[i] < nums[i + 1])
                dec++;
        }

        // circular pair: last -> first
        if (nums[n - 1] > nums[0])
            inc++;

        if (nums[n - 1] < nums[0])
            dec++;

        // increasing rotation
        if (inc == 1) {
            int k = 0;

            while (nums[k] != 0)
                k++;

            return Math.min(k, n - k + 2);
        }

        // decreasing rotation
        if (dec == 1) {
            int k = 0;

            while (nums[k] != n - 1)
                k++;

            return Math.min(k + 1, n - k + 1);
        }

        return -1;
    }
}