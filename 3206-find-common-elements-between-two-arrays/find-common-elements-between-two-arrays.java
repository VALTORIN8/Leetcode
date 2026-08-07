class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //num1 ke elem list1 mei
        List<Integer> list1 = new ArrayList<>();
        for(int num:nums1){
            list1.add(num);
        }
        //num2 ke elemnt list2 mei
        List<Integer> list2 = new ArrayList<>();
        for(int num:nums2){
            list2.add(num);
        }
        //result array
        int[] result=new int[2];
        result[0]=0;
        result[1]=0;
        //nums1 traverse result[0]++
        for(int num : nums1){
            if(list2.contains(num)){
                result[0]++;
            }
        }
        //nums2 .................
        for(int num : nums2){
            if(list1.contains(num)){
                result[1]++;
            }
        }
        return result;
    }
}