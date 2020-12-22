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