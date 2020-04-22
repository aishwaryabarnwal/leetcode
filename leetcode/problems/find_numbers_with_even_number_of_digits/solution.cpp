class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int n = nums.size();
        int res = 0;
        int  c;
        for(int i=0;i<n;i++)
        {
            c = 0;
            while(nums[i])
            {
                c++;
                nums[i] /= 10;
            }
            if(c%2 == 0)
                res++;
        }
        return res;
    }
};