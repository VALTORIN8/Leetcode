/*Question
        ↓
Find Peak
        ↓
Peak mil gaya
        ↓
Binary Search Left (Ascending)
        ↓
Mil gaya?
     /      \
   Yes      No//2 cases bass
   ↓         ↓
 Return   Binary Search Right (Descending)
               ↓        //78 cases pass leetcode ke nakhre honge ig 
            Return / -1*///kha glti hui//right s
            
            
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int left=0;
        int n=mountainArr.length();
        int right=n-1;
        while(left<right){
            int mid=(right+left)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                left=mid+1;//max find kr rhe//ok
            }
            else {//ohk
                right=mid;//mid se pehle max hoga isiliye
            }
        }
        int peak=left;
        right=peak;
        left=0;
        //0 se peak index tk target k liye
        while(left<=right){
            int mid=(right+left)/2;
            int val=mountainArr.get(mid);
            if(val==target)
                return mid;
                
            if(val<target){
                left=mid+1;
            }
            else
            right=mid-1;
        }
        //agar yha target nhi mila to peak se right me find krenge//ohh
        left=peak+1;
        right=n-1;
            while(left<=right){
            int mid=(right+left)/2;
            int val=mountainArr.get(mid);
            if(val==target)
                return mid;
                
            if(val<target){
            right=mid-1;
                
            }
            else
            left=mid+1;
            }
        return -1;
    }
}  
            