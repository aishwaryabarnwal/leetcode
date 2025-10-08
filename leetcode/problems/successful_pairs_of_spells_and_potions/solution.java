class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int p = potions.length;
        int[] res = new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            int l = 0, h = potions.length-1;
            while(l <= h)
            {
                int mid = l + (h-l)/2;
                long product = (long) spells[i] * potions[mid];
                if(product < success)
                    l = mid + 1;
                else if(product >= success)
                    h = mid - 1;
            }
            res[i] = p - l;
            
        }
        return res;
    }
}