class Solution {
    public int minimumCost(int[] cost) {
       //?? 
       Arrays.sort(cost);
       int price=0;
       int p=1;
       for(int i=cost.length-1;i>=0;i--){
        if(p%3!=0){
            price+=cost[i];
        }
            p++;
   
       }//wht mistake 
       return price;//shi to lg rha sb
      }  }
   // /for loop ke under/?//readin