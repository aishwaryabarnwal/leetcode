class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        Boolean[][] dp = new Boolean[pLen+1][sLen+1];
        return wildMatch(p, pLen, s, sLen, dp);

    }

    public boolean wildMatch(String p, int i, String s, int j, Boolean[][] dp) {
        
        if(i == 0 && j == 0)
            return true;
        if(i == 0)
            return false;
        if(j == 0)
        {
            if(p.charAt(i-1) != '*')
                    return false;
            return wildMatch(p,i-1,s,j,dp);
        }
        if(dp[i][j] != null)
            return dp[i][j];
        if(p.charAt(i-1) == s.charAt(j-1) || p.charAt(i-1) == '?') // match
            return dp[i][j] = wildMatch(p, i-1, s, j-1, dp);
        if(p.charAt(i-1) == '*') // not match
            return dp[i][j] = wildMatch(p, i-1, s, j, dp) || wildMatch(p, i, s, j-1, dp);
        
        return dp[i][j] = false;
    }
}