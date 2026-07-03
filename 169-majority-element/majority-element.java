class Solution {
    public int majorityElement(int[] nums) {//ye voh voting algo something tha na ?
        //bhul gya skull //mereko bhi bass name yaad h , jash map se kr sakte h? is key found increse freq++ else add key?
        //hmm ya to sorting se max freq count kre then print//ig iske liye 2 array bana hoga dono kr leneg phele map. phir ye phir voting purana wala ok ji
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                //map value how acces??map.get
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//key define krni hogi//ye sahi h? ha ig
            }
            else{
                map.put(nums[i],1);
            }
        }
        //map ko traverese kaise krte h? maxx count?for luup?//ha vhi //max value ki key
        //??// major element find krne ka way for lop se hi h na? not sure
        int majorityE=0;
        int maxValue=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                majorityE = entry.getKey();
            }
        }
        return majorityE;
    }
}