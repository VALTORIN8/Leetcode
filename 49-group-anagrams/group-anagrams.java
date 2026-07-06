class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){//first string 
            char[] arr=s.toCharArray();//uska char array bana diya 
            Arrays.sort(arr);//ek baar tu bhi likh kr dekhega? maine dekh kr likha almost 
            //sabko sort kara 
            String key = new String(arr);//sorted char se ek new word banaya jisse key liya 
            if(!map.containsKey(key)){//smj hi na aya//agar voh key nhi thi new key or epty list create kiya 
                map.put(key,new ArrayList<>());//ohh ruko princess
            }
            map.get(key).add(s);//or agar key thi toh word list mei add kara
        }
        return new ArrayList<>(map.values());//jo map mei diff list thi unko map se extract kara 
    }//oky ji //next?
}//phele kra ??ha//ok//abse comments bhi save kr denge konsa khud kiya konsa ai baad mei revise easy hoga ohh