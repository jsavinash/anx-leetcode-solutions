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