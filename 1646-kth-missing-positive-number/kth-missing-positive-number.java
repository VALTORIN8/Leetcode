class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int curr = 1;

        while (true) {
            if (i < arr.length && arr[i] == curr) {
                i++;
            } else {
                k--;
                if (k == 0) {
                    return curr;
                }
            }
            curr++;
        }
    }
}