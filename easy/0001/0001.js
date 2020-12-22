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
