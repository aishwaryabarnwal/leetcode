class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count1 = 0, count2 = 0, candidate1 = 0, candidate2 = 0;
        for(int num : nums)
        {
            if(candidate1 == num)
                count1++;
            else if(candidate2 == num)
                count2++;
            else if(count1 == 0)
            {
                candidate1 = num;
                count1++;
            }
            else if(count2 == 0)
            {
                candidate2 = num;
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1 = count2 = 0;
        for(int num : nums)
        {
            if(candidate1 == num)
                count1++;
            else if(candidate2 == num)
                count2++;
        }
        int maj = nums.length/3 + 1;
        if(count1 >= maj)
            res.add(candidate1);
        if(count2 >= maj)
            res.add(candidate2);
        return res;
    }
}