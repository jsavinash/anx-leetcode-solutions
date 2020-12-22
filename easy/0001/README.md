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
2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
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

### Procedure :: 2 :: Algorithm

#### Step : 1 :: Start

#### Step : 2 :: Delcare a function divide number by 4 get reminder and equal parts.

#### Step : 3 :: Find possible sum by dividing reminder further and add to first iteration.

#### Step : 4 :: Stop

### Procedure :: 3 :: Implementation

```
export const cyclicallyRotate = (arr: number[]) => {
  return arr.map((x: number, idx: number) => {
    if (arr[idx + 1]) return arr[idx + 1];
    else return arr.shift();
  });
};

```

### Procedure :: 4 :: Test case

#### Case :: 1 :: When input is not array or string.

### Procedure :: 5 :: Analysis :: Time Complexity

#### Worst Case :: Big oho :: O(n)

#### Average Case :: Big theta :: θ(n)

#### Best Case :: Big omega :: Ω(1)

### Procedure :: 6 :: Analysis :: Space Complexity

#### Worst Case :: Big oho :: O(n)
