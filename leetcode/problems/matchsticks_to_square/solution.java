class Solution {
    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        int total = 0;
        for(int i : matchsticks)
        {
            total += i;
        }
        if (total % 4 != 0) 
            return false;
        Arrays.sort(matchsticks);
        return match(matchsticks, n-1, new int[4], total/4);
    }
    public boolean match(int[] matchsticks, int index, int[] sum, int target)
    {
        if(index == -1)
            return true;
        for(int i=0;i<4;i++)
        {
            if((sum[i] + matchsticks[index]>target) || (i>0 && sum[i] == sum[i-1]))
                continue;
            
            sum[i]+=matchsticks[index];
            
            if(match(matchsticks, index-1, sum, target))
                return true;
            sum[i]-= matchsticks[index];
        }
        return false;
    }
}