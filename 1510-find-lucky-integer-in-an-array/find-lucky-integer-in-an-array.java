class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            // put value = getOrDefault + 1
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int answer = -1; // default if none found
        for (int key : freqMap.keySet()) {
            if (key == freqMap.get(key)) {
                answer = Math.max(answer, key); // keep max
            }
        }
        return answer;
    }
}