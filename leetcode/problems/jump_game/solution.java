class Solution {
    public boolean canJump(int[] nums) {
       int maxStep = 0;
       int n = nums.length;
       for(int i=0;i<n;i++)
       {
            if(maxStep < i)
                return false;
            maxStep = Math.max(maxStep, i + nums[i]);
       }
       return true;
    }
}