class Solution {
    public int balancedStringSplit(String s) {
        int res = 0, count = 0;
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i) == 'R')
        //     {
        //         count += 1;
        //     }
        //     else
        //     {
        //         count += -1;
        //     }
        //     if(count == 0)
        //         res++;
        // }
        for (char letter : s.toCharArray()) {
            count += (letter == 'R' ? 1 : -1);
            if (count == 0) {
                res++;
            }
        }
        return res;
    }
}