import java.util.*;
import java.util.stream.*;

class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        // Step 1: Build mapping from moveFrom → moveTo
        HashSet<Integer> list=new HashSet<>();
        for(int x:nums){
            list.add(x);
        }
        for(int i=0;i<moveFrom.length;i++){
            list.remove(moveFrom[i]);
            list.add(moveTo[i]);
        }
        List<Integer> ans = new ArrayList<>(list);
        Collections.sort(ans);
        return ans
        ;
    }
}
