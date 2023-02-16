class Solution {
    public int addDigits(int num) {
        if(num >= 0 && num < 10)
            return num;
        int res = num;
        while(res>9)
        {
            res = sum(res);
        }
        return res;
    }
    public int sum(int n) {
        int sum = 0, rem = 0;
        while(n!=0)
        {
            rem = n % 10;
            while(rem == 0 )
            {
                n /= 10;
                rem = n % 10;
            }
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}