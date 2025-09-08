class Solution {
    public int[] getAverages(int[] nums, int k) {
        int l = 0, r = 0; 
        long subSum = 0;
        int ws = 2*k+1; //window size
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        if (ws > n) 
            return ans;
        while(r < n)
        {
            subSum += nums[r];
            if(r-l+1 == ws)
            {
                ans[r-k] = (int) (subSum / ws);
                subSum -= nums[l];
                l++;
            }
            r++;
        }
        return ans;
    }
}