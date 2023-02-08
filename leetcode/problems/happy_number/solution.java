class Solution {
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();
        while((n != 1) && !map.contains(n))
        {
            map.add(n);
            n = getDigitSum(n);
        }
        return (n == 1); 
    }
    public int getDigitSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
}