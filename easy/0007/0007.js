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

console.log(reverseNumber(-123));

// Process :-
/**
 * 1. Iterate is such a way that, on every interation digit from right most get removed.
 * 2. Grab right most digit from number.
 * 3. Take a variable with assignment 0, on every iteration multiple variable with 10 and add right most digit from number,
 *    at the end we will have reverse number.
 */
