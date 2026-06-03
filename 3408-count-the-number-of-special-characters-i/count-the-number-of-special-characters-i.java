class Solution {
    public int numberOfSpecialChars(String word) {
    
        int count=0;
        int n=word.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(word.charAt(i));
        }
        
        for (char ch : set) {
            if (Character.isUpperCase(ch)) {
                char c=Character.toLowerCase(ch);
                if(set.contains(c)){
                    count++;
                }
            }
        }
        return count;
        
    }
}