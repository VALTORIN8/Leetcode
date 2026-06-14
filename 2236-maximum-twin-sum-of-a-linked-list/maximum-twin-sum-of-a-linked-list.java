class Solution {
    public int pairSum(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        int i = 0;
        temp = head;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }

        int maxSum = 0;
        for (i = 0; i < count / 2; i++) {
            int sum = arr[i] + arr[count - 1 - i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
