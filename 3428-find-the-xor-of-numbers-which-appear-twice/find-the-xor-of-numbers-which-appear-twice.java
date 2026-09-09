class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        //xor?//hm ^ ye
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int num : nums){
            if(set1.contains(num)){
                set2.add(num);
            }
            else{
                set1.add(num);
            }
        }
        int result=0;
        if(set2.size()==0){
            result=0;
        }
        else{
            for(int val :set2){//sahi h
                
                result^=val;
            }
        }
        return result;
    }
}