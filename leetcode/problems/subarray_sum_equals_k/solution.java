class Solution {
    public int subarraySum(int[] nums, int k) {
       int n = nums.length;
       int c = 0, presum = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
       mpp.put(0,1);
       for(int i=0;i<n;i++)
       {
            presum += nums[i];
            int remove = presum - k;
            c += mpp.getOrDefault(remove, 0);
            mpp.put(presum, mpp.getOrDefault(presum, 0)+1);
       }
       return c;
    }
}