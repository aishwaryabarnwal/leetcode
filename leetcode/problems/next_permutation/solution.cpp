class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        int c = 0;
        if(n==1)
            return;
        for(int i=0;i<n-1;i++)
        {
           if(nums[i]<=nums[i+1])
               break;
            c++;
        }
        if(c==n)
        {
            sort(nums.begin(), nums.end());
        }
        else
         next_permutation(nums.begin(), nums.end());   
    }
};