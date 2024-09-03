class Solution {
    public long beautifulSubarrays(int[] nums) {
        long c = 0;
        int frontXor = 0;
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<n;i++)
        {
            frontXor ^=  nums[i];
            int x = frontXor ^ 0; // here k = 0 for beautiful subarry
            c += mpp.getOrDefault(x, 0);
            mpp.put(frontXor, mpp.getOrDefault(x, 0)+1);
        }
        return c;
    }
}