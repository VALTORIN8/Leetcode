class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int arr1[]=arr.clone();//aisa bhi kuch hota h 
        Arrays.sort(arr1);//ha ig try krte hai//ok
        int max=arr1[n-1];
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                return i;
            
        }
        }
        return -1;
    }
}
