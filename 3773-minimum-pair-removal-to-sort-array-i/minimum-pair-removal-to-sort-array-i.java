class Solution {
    public int minimumPairRemoval(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int x : nums) {
            arr.add(x);
        }

        int ans = 0;

        while (!isSorted(arr)) {

            int index = 0;
            int minSum = arr.get(0) + arr.get(1);

            // Find minimum pair
            // '<' means leftmost is automatically selected on tie
            for (int i = 1; i < arr.size() - 1; i++) {

                int sum = arr.get(i) + arr.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Merge pair
            arr.set(index, minSum);

            // Remove second element of pair
            arr.remove(index + 1);

            ans++;
        }

        return ans;
    }

    public boolean isSorted(ArrayList<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {

            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}