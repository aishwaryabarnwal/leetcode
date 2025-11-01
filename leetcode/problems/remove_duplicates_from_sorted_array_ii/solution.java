class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        boolean flag = false;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[j++] = nums[i];
                flag = false;
            }
            else if(nums[i] == nums[i-1] && !flag)
            {
                flag = true;
                nums[j++] = nums[i];
            }
             
        }
        return j;
    }
}