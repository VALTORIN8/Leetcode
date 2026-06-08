class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //hoga ig//ok
        int n=nums.length;//kr tu ise ai 
       //oye ek kaam kr//
       //sun for loop lga and find kr kitne element pivot se less hai use less int me store krr//result rray mei store hoga
        int[] result= new int[n];
        int idx=0;
        
        for(int num :nums){
            if(num<pivot){
                result[idx++]=num;
            }
        }
        for(int num : nums){
            if(num==pivot){
                result[idx++]=num;
            }
        }
        for(int num :nums){
            if(num>pivot){
                result[idx++]=num;
            }
        }
        return result;
    }
}
