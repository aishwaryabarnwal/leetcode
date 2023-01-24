class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = Integer.MIN_VALUE;
        
        int m = accounts.length, n = accounts[0].length;
        for(int i=0;i<m;i++)
        {
            int sum = 0;
            for(int j=0;j<n;j++)
            {
                sum += accounts[i][j];
            }
            if(sum > richest)
                richest = sum;
        }
        return richest;
    }
}