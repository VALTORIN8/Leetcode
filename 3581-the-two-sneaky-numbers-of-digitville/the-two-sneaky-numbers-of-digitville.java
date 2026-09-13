class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result=new int[2];
        int k=0;
        for(int num : nums){
            if(set.contains(num)){
                result[k++]=num;
            }
            else{
                set.add(num);
            }
        }
        return result;
    }
}