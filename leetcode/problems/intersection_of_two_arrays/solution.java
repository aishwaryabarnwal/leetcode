class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            set.add(nums1[i]);
        }
        for(int i=0;i<n2;i++)
        {
            if(set.contains(nums2[i]))
                intersect.add(nums2[i]);
        }
        int[] res = new int[intersect.size()];
        int i = 0;
        for(Integer num : intersect)
        {
            res[i++] = num;
        }
        return res;
    }
}