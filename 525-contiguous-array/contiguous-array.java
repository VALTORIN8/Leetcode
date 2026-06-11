/* import java.util.Arrays;

class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        int start = 0;
        int last = n - 1;
        int[] subarray = new int[n];
        int result = 0;

        while (start != last) {
            subarray = Arrays.copyOfRange(arr, start, last);
            if (countZero(subarray) == countOne(subarray)) {
                result = subarray.length;
                break;
            } else if (countZero(subarray) != countOne(subarray)) {
                subarray = Arrays.copyOfRange(arr, start - 1, last);
                if (countZero(subarray) == countOne(subarray)) {
                    result = subarray.length;
                    break;
                }
            } else if (countZero(subarray) != countOne(subarray)) {
                subarray = Arrays.copyOfRange(arr, start, last - 1);
                if (countZero(subarray) == countOne(subarray)) {
                    result = subarray.length;
                    break;
                }
            } else if (countZero(subarray) != countOne(subarray)) {
                subarray = Arrays.copyOfRange(arr, start - 1, last - 1);
                if (countZero(subarray) == countOne(subarray)) {
                    result = subarray.length;
                    break;
                }
            }
            start++;
            last--;
        }

        return result;
    }

    public static int countZero(int[] arr) {
        int countZero = 0;
        for (int num : arr) {
            if (num == 0)
                countZero++;
        }
        return countZero;
    }

    public static int countOne(int[] arr) {
        int countOne = 0;
        for (int num : arr) {
            if (num == 1)
                countOne++;
        }
        return countOne;
    }
}
//princessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
//palak code sahi kroooooooooooooooooooooooooooooooooooooooooooooo//bc smj to aaye //hehehehe toh apna likh/*  */ 

/*chalo ekdum scratch se samjhate hain 🙂

---

**Problem kya hai?**
Equal 0s aur 1s wala sabse lamba subarray dhundho.

---

**Trick: 0 ko -1 maan lo**

```
Original:  [0, 1, 1, 1, 1, 1, 0, 0, 0]
Replace:   [-1, 1, 1, 1, 1, 1,-1,-1,-1]
```

Ab agar kisi subarray ka **sum = 0** hai → equal 0s aur 1s hain ✅

---

**Running sum (prefix sum) banao**

```
index:   -1   0   1   2   3   4   5   6   7   8
sum:      0  -1   0   1   2   3   4   3   2   1
```

---

**Key observation 👇**

Same sum **do baar** aaya → beech wala part cancel ho gaya = equal 0s & 1s

```
sum=0 → index -1 pe aur index 1 pe
        length = 1 - (-1) = 2 ✅

sum=1 → index  2 pe aur index 8 pe
        length = 8 - 2 = 6 ✅  (ye sabse lamba hai)
```

---

**Isliye HashMap use karte hain**
- Har sum ka **pehli baar** dekha index store karo
- Dobara same sum mile → difference lo → wo subarray ki length hai

```java
map.put(0, -1);  // seed: sum=0 index=-1 pe tha (kuch bhi nahi)

sum=0 mile dobara → i - map.get(0) = 1 - (-1) = 2
sum=1 mile dobara → i - map.get(1) = 8 - 2    = 6  ← answer
```

---

**Bas yahi poora solution hai** — no magic, sirf ek clever observation! 😄/*/
class Solution {
    public int findMaxLength(int[] nums) {
        // Replace 0s with -1s
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0) nums[i] = -1;

        // Prefix sum + hashmap
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum))
                max = Math.max(max, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return max;
    }
}
