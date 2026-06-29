class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        int count=0;
        for(String pattern : patterns){
            if(word.contains(pattern)){//wah
                count++;//sahi h ?
            }
        }
        return count;
    }
}