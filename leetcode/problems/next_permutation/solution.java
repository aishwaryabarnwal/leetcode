class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        //find breakpoint
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                ind = i;
                break;
            }
        }
        if(ind == -1)
        {
            Arrays.sort(nums);
        }
        else
        {
            for(int i=n-1;i>ind;i--)
            {
                if(nums[i] > nums[ind])
                {
                    swap(nums, ind, i);
                    break;
                }
            }
            Arrays.sort(nums, ind+1, n);
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}