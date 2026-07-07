class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int min = prices[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }

        int max = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(right[i + 1], max - prices[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, left[i] + right[i]);
        }

        return ans;
    }
}
/*Chal **class 1 wali language** me samajhte hain. 😄

Question:

> **Maximum 2 baar share kharid aur bech sakte ho.**

Example:

```text
prices = [3,3,5,0,0,3,1,4]
```

Hum sochte hain:

> **Kis din ke baad pehla transaction khatam karu aur dusra shuru karu?**

Isliye har day ko **cut point (split point)** maan lete hain.

---

# Step 1: left[] banao

`left[i]` = **0 se i tak** maximum profit.

### Price

```text
Day    0 1 2 3 4 5 6 7
Price  3 3 5 0 0 3 1 4
```

Minimum price yaad rakhte hain.

Initially

```text
min = 3
```

---

### i = 1

Price = 3

```text
Profit = 3-3 = 0
```

```text
left = 0 0
```

---

### i = 2

Price = 5

```text
Profit = 5-3 = 2
```

```text
left = 0 0 2
```

---

### i = 3

Price = 0

Ab minimum change ho gaya.

```text
min = 0
```

Profit

```text
0-0 = 0
```

Lekin pehle se 2 profit mil chuka tha.

```text
left = max(2,0)

=2
```

```text
left = 0 0 2 2
```

---

Isi tarah end tak

```text
left =
0 0 2 2 2 3 3 4
```

Matlab

```text
left[5]=3
```

Yaani

**Day 0 se Day 5 ke beech maximum 3 kama sakte ho.**

---

# Step 2: right[]

Ab ulta chalenge.

`right[i]`

Matlab

**i se end tak maximum profit**

Start

```text
max = 4
```

---

Day 6

Price =1

```text
Profit=4-1=3
```

```text
right[6]=3
```

---

Day5

Price=3

```text
Profit=4-3=1
```

Pehle se 3 tha

```text
right[5]=3
```

Aise hi

```text
right=

4 4 4 4 4 3 3 0
```

Matlab

```text
right[2]=4
```

Day2 ke baad future me maximum 4 kama sakte ho.

---

# Step3

Ab har day ko partition maan lo.

Example

## Split at Day2

```text
left[2]=2

right[2]=4
```

Total

```text
2+4=6
```

Matlab

```text
Day0 ----- Day2 | Day3 ----- End
```

Pehla transaction left side.

Dusra transaction right side.

Ye overlap bhi nahi karenge.

---

Split Day5

```text
left[5]=3

right[5]=3

Total=6
```

---

Saare split check karte hain

```text
Day     0 1 2 3 4 5 6 7

Left    0 0 2 2 2 3 3 4

Right   4 4 4 4 4 3 3 0

Sum     4 4 6 6 6 6 6 4
```

Maximum

```text
6
```

# Bas pura idea ek line me:

* **`left[i]` = i tak ka best profit**
* **`right[i]` = i ke baad ka best profit**
* Har `i` ko **cut point** maan kar `left[i] + right[i]` nikalte hain.
* Jo sabse bada hoga, wahi answer hai.

Yahi trick LC 123 ka core concept hai. Agar ye "cut point" wali thinking samajh aa gayi, to code bhi naturally samajh aa jayega.
*/