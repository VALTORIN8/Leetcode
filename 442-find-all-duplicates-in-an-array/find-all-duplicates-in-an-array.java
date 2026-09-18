class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //hlo princesssssss hlog//pakkad liya princess ko 
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int num : nums){
            if(set.contains(num)){
                result.add(num);
            }
            else{
                set.add(num);
            }
        }
        return result;
        
    }
    
}