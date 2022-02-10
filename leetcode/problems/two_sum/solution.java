class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            Integer diff = (Integer)(target - nums[i]);
            if(map.containsKey(diff))
            {
                int[] res = {map.get(diff), i};
                return res;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}