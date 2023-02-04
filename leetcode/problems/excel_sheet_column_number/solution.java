class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0, rem = 0;
        int n = columnTitle.length();
        for(int i=0;i<n;i++)
        {
            char ch = columnTitle.charAt(i);
            rem = ((ch - 'A') + 1);
            res = 26 * res + rem;

        }
        return res;
    }
}