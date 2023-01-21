class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int val = 0, res = 0;
        for(int i=n-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'I':
                    val = 1;
                    break;
                case 'V':
                    val = 5;
                    break;
                case 'X':
                    val = 10;
                    break;
                case 'L':
                    val = 50;
                    break;
                case 'C':
                    val = 100;
                    break;
                case 'D':
                    val = 500;
                    break;
                case 'M':
                    val = 1000;
                    break;

            }
            if(val*4 < res)
            {
                res -= val;
            }
            else
            {
                res += val;
            }
        }
        return res;
    }
}