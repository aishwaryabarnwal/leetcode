class Solution {
    public boolean isPalindrome(int x) {
        int num = x, x1=0;
        if (x < 0 || (x % 10 == 0 && x != 0)) 
            return false;
        while(x!=0)
        {
            x1 = x1 * 10 + x % 10;
            x /= 10;

        }
        return x1 == num;
    }
}