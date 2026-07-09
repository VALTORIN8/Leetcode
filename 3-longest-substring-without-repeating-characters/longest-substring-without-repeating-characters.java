class Solution {
    public int lengthOfLongestSubstring(String s) {
        //ab likh isme topic likha h sliding window hash table or staff
       // algo
        HashSet<Character> set = new HashSet<>();
        int n=s.length();
        //1. Left = 0
        int left=0;
        int ans=0;
        //2. Right ko loop chalao
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans=Math.max(ans,right-left+1);
        }
        return ans;
       // 3. Agar duplicate mile
           // left se remove karte jao
        //4. Character add karo
        //5. ans = max(ans, window length)
    }
}