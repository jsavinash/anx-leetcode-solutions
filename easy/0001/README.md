### Problem Statement :-

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

```
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
```

Constraints:

```
2 <= nums.length <= 10^3
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.
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

we have given a two variable nums and target,

Variable nums is array of number and length of array is between (2 to 1000).

Array element is number range between (-1000000000 to 1000000000).

Variable target is number range between (-1000000000 to 1000000000).

#### Output :-

Find indices of 2 number in array, such a way that it's total is equal to target number.

### Procedure :: 2 :: Algorithm

#### Step : 1 :: Start

#### Step : 2 :: Iterate array in nested loop and increment the inner loop count by outer loop count plus one, for indices collison prevention.

#### Step : 3 :: Find sum of two number equal to target.

#### Step : 4 :: Once sum equal to target, get indices of 2 number and return it.

#### Step : 5 :: Stop

### Procedure :: 3 :: Implementation

```
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] intArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    intArray[0] = i;
                    intArray[1] = j;
                    break;
                }
            }
        }
        return intArray;
    }
}

class Solution {
    public static void main(String args[]) {
        TwoSum twoSumObject = new TwoSum();
        int[] input = { 1, 3, 4, 5 };
        int target = 7;
        int[] output = twoSumObject.twoSum(input, target);
        System.out.println(output[0]);
        System.out.println(output[1]);
    }
}

```

```
const sumTwo = (nums, target) => {
  const intArr = [];
  for (var i = 0; i < nums.length; i++) {
    for (var j = i; j < nums.length; j++) {
      if (nums[i] + nums[j] === target) {
        intArr[0] = i;
        intArr[1] = j;
        break;
      }
    }
  }
  return intArr;
};

input = [1, 3, 4, 5];
target = 7;
console.log(sumTwo(input, target));

```

### Procedure :: 4 :: Test case

#### Case :: 1 :: Number with negative value.

```
input = [-7, -8, -6];
target = -13;
```

#### Case :: 2 :: Number with positive value.

```
input = [7, 8, 6];
target = 13;
```

#### Case :: 3 :: Number with positive and negative value.

```
input = [-1, 0, 1];
target = 0;
```

### Procedure :: 5 :: Analysis :: Time Complexity

#### Worst Case :: Big oho :: O(n²)

#### Average Case :: Big theta :: θ(n²)

#### Best Case :: Big omega :: Ω(1)

### Procedure :: 6 :: Analysis :: Space Complexity

#### Worst Case :: Big oho :: O(N)
