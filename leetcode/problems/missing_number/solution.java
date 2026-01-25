class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n;
        for(int i=0;i<n;i++)
            res ^= i ^ nums[i]; // a ^ a = 0
        
        return res;
        
    }
}