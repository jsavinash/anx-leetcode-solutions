### Problem Statement :-

Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2^31, 2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

```
Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

Example 4:

Input: x = 0
Output: 0
```

Constraints:

```
-2^31 <= x <= 2^31 - 1
```

### Procedures :-

- [1.Clarification]
- [2.Algorithm]
- [3.Implementation]
- [4.Testcase]
- [5.Time-Complexity]
- [6.Space-Complexity]

### Procedure :: 1 :: Clarification

#### Input :-

we have input number range from (-2147483648 to 2147483647).

#### Output :-

Return reverse of number, if number overflow return 0.

### Procedure :: 2 :: Algorithm

#### Step : 1 :: Start

#### Step : 2 :: Iteration increment based on number divided by 10 and condition should be number not equal to 0.

#### Step : 3 :: Assign a variable result with 0 and put it into iteration loop and apply formula result = (result X 10) + x % 10 return the inverted number.

#### Step : 4 :: Stop

### Procedure :: 3 :: Implementation

#### Language :: JAVA

```
class ReverseNumber {
    public int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}

class Solution0007 {
    public static void main(String args[]) {
        ReverseNumber reverseObject = new ReverseNumber();
        System.out.println(reverseObject.reverse(123));
    }
}
```

#### Language :: Javascript

```

const reverseNumber = (x) => {
  let res = 0;
  const isPositive = x < 0 ? false : true;
  x = Math.abs(x);
  for (; x != 0; x = Math.floor(x / 10)) {
    res = res * 10 + (x % 10);
  }
  res = isPositive ? res : -res;
  return res < -2147483648 || res > 2147483647 ? 0 : res;
};

```

### Procedure :: 4 :: Test case

#### Case :: 1 :: Maximum negative number.

```
input = -2147483648
```

#### Case :: 2 :: Maximum postive number.

```
input = 2147483647
```

#### Case :: 3 :: Middle number.

```
input = 0;
```

### Procedure :: 5 :: Analysis :: Time Complexity

#### Worst Case :: Big oho :: O(log n)

#### Average Case :: Big theta :: θ(log n)

#### Best Case :: Big omega :: Ω(1)

### Procedure :: 6 :: Analysis :: Space Complexity

#### Worst Case :: Big oho :: O(log n)

```

```
