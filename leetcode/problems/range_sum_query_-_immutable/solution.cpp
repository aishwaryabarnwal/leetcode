class NumArray {
    vector<int>a;
public:
    NumArray(vector<int>& nums) {
        a =nums;
        int n = nums.size();
        for(int i=1;i<n;i++)
            a[i] += a[i-1];
    }
    
    int sumRange(int i, int j) {
       if(i)
           return a[j]-a[i-1];
        return a[j];
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(i,j);
 */