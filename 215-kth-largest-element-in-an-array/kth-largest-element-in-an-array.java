import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Java ka PriorityQueue default me Min-Heap hota hai
        // Isliye sabse chhota element hamesha top par rahega
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            // Current number heap me add kar rahe hain
            minHeap.add(num);

            // Agar heap ka size k se bada ho gaya,
            // to sabse chhota element remove kar do
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // peek() top element ko sirf dekhta hai,
        // remove nahi karta
        // Yahan top element kth largest hai
        return minHeap.peek();
    }
}