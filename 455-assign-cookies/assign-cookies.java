class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //same cookie 2 ko de sakte?//nhi//2 pointerrs topic likha h
        //dono array sort krke ho sakta? ha but ll me dalna hoga ya stack me ig
        //humko ye chhaiye ke array 1 mei se ek elemet leke uska pair array 2 se bbanke remove ho jaye toh ig array list sahi rahega?usme duplicates bhi dalte h?ya hash map freq count
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
            }
            else 
            {
                j++;
            }
            
        }
    return i;
    }
}