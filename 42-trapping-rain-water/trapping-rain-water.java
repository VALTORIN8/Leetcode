class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
                
        }
        int water=0;
        for(int i=0;i<n;i++){
            water+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return water;

    }
}
/*height =  [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]

leftMax = [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
           → → → → → → → → → → → →
           (scan left to right, keep the biggest seen so far)

rightMax= [3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]
           ← ← ← ← ← ← ← ← ← ← ← ←
           (scan right to left, keep the biggest seen so far)

Water at each spot:
  min(0,3)-0 = 0   (no water)
  min(1,3)-1 = 0   (no water)//ho jayega ig
  min(1,3)-0 = 1   ✅ 1 unit water!
  min(2,3)-2 = 0   (no water)
  min(2,3)-1 = 1   ✅ 1 unit water!
  min(2,3)-0 = 2   ✅ 2 units water!
  min(2,3)-1 = 1   ✅ 1 unit water!
  min(3,3)-3 = 0   (no water)
  min(3,2)-2 = 0   (no water)
  min(3,2)-1 = 1   ✅ 1 unit water!
  min(3,2)-2 = 0   (no water)
  min(3,1)-1 = 0   (no water)

Total = 1+1+2+1+1 = 6 🎉*/