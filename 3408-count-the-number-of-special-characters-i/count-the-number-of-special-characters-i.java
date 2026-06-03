class Solution {
    public int numberOfSpecialChars(String word) {
        //hash set se ho jayega ig 
        
        //bro wait ek kaam aagya 2 min//ok
        int count=0;
        int n=word.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(word.charAt(i));
        }
        
        for (char ch : set) {
            if (Character.isUpperCase(ch)) {
                char c=Character.toLowerCase(ch);//char hota h ??hmm same hi hai
                if(set.contains(c)){//ye sahi likha h synatx?ha
                    count++;
                }
            }
        }
        return count;
        
    }
}