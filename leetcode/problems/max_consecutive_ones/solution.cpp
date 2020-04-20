class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n = nums.size();
        int win = 0;
        int len = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1)
            {
                win++;
               // cout<<win<<endl;
            }
            else
            {
                if(len < win)
                    len = win;
                 win = 0;
            }     
        }
         if(len < win)
            len = win;
        return len;
    }
};