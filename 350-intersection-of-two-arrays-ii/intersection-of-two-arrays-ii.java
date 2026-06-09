class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> data = new HashMap<>();
        for(int num : nums1){
            data.put(num,data.getOrDefault(num, 0) + 1);
        }  
        //int n=nums1.length < nums2.length ? nums1.length :nums2.length;//sahi h ?
        List<Integer> result = new ArrayList<>();
        int k=0;
        for(int num:nums2){
            if(data.getOrDefault(num,0)>0){
                result.add(num); 
                data.put(num,data.get(num)-1);
                
            }//bc 0 0 aa rha//ha chota size le?
        }//wait
        return result.stream().mapToInt(i -> i).toArray();
    }
}