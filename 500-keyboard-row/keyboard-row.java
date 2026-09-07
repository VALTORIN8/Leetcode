/* class Solution {
    public String[] findWords(String[] words) {
        //phele letters ke 3 set
        //phir array traverese har word charat set mei checck krenge agar hoga toh add in result aray?yup aise hi hoga ig//chill kro princess
        String str1 =  "qwertyuiop";
        HashSet<Character> set1 = new HashSet<>();
        for (char ch : str1.toCharArray()) {
            set1.add(ch);
        }
        String str2 =  "asdfghjkl";
        HashSet<Character> set2 = new HashSet<>();
        for (char ch : str2.toCharArray()) {
            set2.add(ch);
        }
        String str3 =  "zxcvbnm";
        HashSet<Character> set3 = new HashSet<>();
        for (char ch : str3.toCharArray()) {
            set3.add(ch);
        }
        String[] result=new String[words.length];
    }
} */
class Solution {
    public String[] findWords(String[] words) {

        ArrayList<String> ans = new ArrayList<>();

        for (String word : words) {

            String w = word.toLowerCase();

            if (w.matches("[qwertyuiop]+") ||
                w.matches("[asdfghjkl]+") ||
                w.matches("[zxcvbnm]+")) {

                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}