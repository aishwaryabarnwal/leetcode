class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0, h = n-1;
        int[] res = new int[2];
        while(l < h)
        {
            int sum = numbers[l] + numbers[h];
            if(sum < target)
                l++;
            else if(sum > target)
                h--;
            else
            {
                res[0] = l+1;;
                res[1] = h+1;
                return res;
            }      
        }
        return res;
    }
}