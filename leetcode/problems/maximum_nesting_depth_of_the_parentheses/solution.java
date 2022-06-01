class Solution {
    public int maxDepth(String s) {
        int res = 0, count = 0;
        int n = s.length();
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                count++;
            }
            else if(ch == ')')
            {
                count--;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}