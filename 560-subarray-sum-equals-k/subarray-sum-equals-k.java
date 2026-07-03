class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(); // prefixSum -> KITNI BAAR aaya
        int tillsum = 0;
        int count = 0;
        map.put(0, 1); // sum 0, ek baar aaya hai (empty prefix)
        
        for (int i = 0; i < n; i++) {
            tillsum += nums[i];
            
            if (map.containsKey(tillsum - k)) {
                count += map.get(tillsum - k); // KITNI baar mila, utni subarrays milengi
            }
            
            map.put(tillsum, map.getOrDefault(tillsum, 0) + 1); // frequency badhao
        }
        
        return count;
    }
}