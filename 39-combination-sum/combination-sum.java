class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        
        // Base case: target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));  // Important: make a copy!
            return;
        }
        
        // Base case: exceeded target
        if (target < 0) {
            return;
        }
        
        // Try each candidate from start index
        for (int i = start; i < candidates.length; i++) {
            
            // Choose: add current candidate
            current.add(candidates[i]);
            
            // Explore: recurse with same index (reuse allowed)
            backtrack(candidates, target - candidates[i], i, current, result);
            
            // Unchoose: backtrack
            current.remove(current.size() - 1);
        }
    }
}