class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        Boolean[][] dp = new Boolean[pLen+1][sLen+1];
        return isMatching(s, p, pLen, sLen, dp);
    }

     public boolean isMatching(String s, String p, int i, int j, Boolean[][] dp) {

       if (i == 0 && j == 0)
            return true;
        if (i == 0)
            return false;
        if(j == 0)
        {
            if (p.charAt(i - 1) != '*')
                return false;
            return isMatching(s, p, i - 2, j, dp);
        }
        if(dp[i][j] != null)
            return dp[i][j] ;
        if(p.charAt(i-1) == s.charAt(j-1) || p.charAt(i-1) == '.')
                return isMatching(s, p, i - 1, j - 1, dp);
        if(p.charAt(i-1) == '*')
        {
            boolean ans = isMatching(s, p, i - 2, j, dp);//skip case

            // one or more occurrence
            if (p.charAt(i - 2) == s.charAt(j - 1) || p.charAt(i - 2) == '.') {
                ans = ans || isMatching(s, p, i, j - 1, dp);
            }

            return dp[i][j] = ans;
        }

        return dp[i][j] = false;
     }
}