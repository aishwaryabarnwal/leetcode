class Solution {
    public int findGCD(int[] nums) {
        int len = nums.length; 
        Arrays.sort(nums);
        int res = 0;
        int s = nums[0];
        int l = nums[len-1];
        for(int i=1;i<=s;i++)
        {
            if(s % i == 0 && l % i == 0)
            {
                res = i;
            }
        }
        return res;
    }
}