class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int[] count = new int[n];
        int max_count = 0, currMax = 0, start = 0, fCount = 0;
        for(int end=0;end<n;end++)
        {
            if(count[fruits[end]] == 0)
                fCount++;
            count[fruits[end]]++;
            currMax++;  
            while(fCount > 2 && start < end) {
                count[fruits[start]]--;
                if(count[fruits[start]] == 0) 
                    fCount--;
                start++;
                currMax--;
            }
            
            max_count = Math.max(max_count, currMax);
        }
        
        return max_count;                  
    }
}