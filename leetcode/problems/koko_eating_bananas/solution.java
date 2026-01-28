class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = 0;
        for(int pile : piles)
        {
            if(pile > maxi)
                maxi = pile;
        }

        int l = 1, r = maxi;
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            long mini = finMinValK(piles, mid);
            if(mini <= h)
                r = mid - 1;
            else 
                l = mid + 1;            
        }
        return l;
    }
    public long finMinValK(int[] piles, int mid) {
        long sum  = 0;
        for(int pile : piles)
        {
            int d = pile / mid;
            sum += d;
            if(pile % mid  > 0)
                sum++;

            // or (pile + mid - 1) / mid 
        }
        return sum;
    }
}