class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            if(list.isEmpty() || list.get(list.size() - 1) < num)
                list.add(num);
            else
            {
                int idx = binarySearch(list, num);
                list.set(idx, num);
            }
        }
        return list.size();
    }

    public int binarySearch(List<Integer> list, int target) {
        int l = 0, h = list.size() - 1;
        while(l <= h)
        {
            int mid = l + (h - l)/2;
            if(list.get(mid) == target)
                return mid;
            else if(list.get(mid) > target)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}