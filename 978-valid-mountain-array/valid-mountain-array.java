class Solution {
    public boolean validMountainArray(int[] arr) {
        //step 1 find max element//ohhh
        int cloned[]=arr.clone();
        Arrays.sort(cloned);
        int n=arr.length;      
        int max=cloned[n-1];
        int indx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                indx=i;
            }
        }
          if (indx == 0 || indx == n - 1)
            return false;

        for(int i=0;i<indx;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for(int i=indx;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            } 
        }
        
       
  
         return true;
    }
}