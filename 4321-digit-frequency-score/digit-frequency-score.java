class Solution {
    public int digitFrequencyScore(int n) {
        //hashmap bnate hai//yes

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int p=n;
        int result=0;
        while(p>0){//sab digit map mei add hogi freq map jaise
            int digit=p%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            p /= 10;
        }
       
        for (int key : map.keySet()) {
            int value = map.get(key);
            result += key * value;
        }
        return result;
    }
}