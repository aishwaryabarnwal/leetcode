class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        int [] res = new int[n];
        int p1 = 0, p2 = n-1;
        for(int i=n-1;i>=0;i--)
        {
            int sp1 = nums[p1] * nums[p1];
            int sp2 = nums[p2] * nums[p2];
            if(sp2 >= sp1)
            {
                res[i] = sp2;
                p2--;
            }
            else
            {
                res[i] = sp1;
                p1++;
            }
        }
        return res;
    }
}