class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!h.add(nums[i]))
                return true;
            if(h.size() > k)
                h.remove(nums[i-k]);
        }
        return false;
    }
}