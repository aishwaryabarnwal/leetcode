class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            res[count] = nums[i];
            res[count+1]=nums[i+n];
            count +=2;
        }
        return res;
    }
}