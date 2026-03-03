class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (n == 4) return false;  // all unhappy numbers cycle through 4

        return isHappy(sumOfSquares(n));
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
/* ```

**Why does checking for `4` work?**

Every unhappy number eventually falls into this fixed cycle:
```
4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 → ...
```
Since **all** unhappy numbers inevitably pass through `4`, it acts as a universal cycle detector — no set needed.

**Recursive call stack for n = 19:**
```
isHappy(19)
  isHappy(82)
    isHappy(68)
      isHappy(100)
        isHappy(1) → return true ✓
```

**Recursive call stack for n = 2:**
```
isHappy(2)
  isHappy(4) → return false ✓ */