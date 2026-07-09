class Solution {
    public int lengthOfLongestSubstring(String s) {
       // algo
        HashSet<Character> set = new HashSet<>();
        int n=s.length();
        //1. Left = 0
        int left=0;
        int ans=0;
        //2. Right ko loop chalao
        for(int right=0;right<n;right++){
       // 3. Agar duplicate mile
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
           // left se remove karte jao
                left++;
            }
        //4. Character add karo
            set.add(s.charAt(right));
        //5. ans = max(ans, window length)
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}