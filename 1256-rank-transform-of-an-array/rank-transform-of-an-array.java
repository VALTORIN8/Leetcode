class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=arr.length;
        int copycat[]=new int[n];//aalas nhi krna
        for(int i=0;i<n;i++){
            copycat[i]=arr[i];
        }
        Arrays.sort(copycat);
        int rank=1;//arr
        for (int i = 0; i < n; i++) {//rank 1 se thi ha//logical eroor hai//yes princess
            if(!map.containsKey(copycat[i])){
                map.put(copycat[i],rank);
                rank++;
            }//princess yha sab elemts dalne h//wait penguin//oki
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}