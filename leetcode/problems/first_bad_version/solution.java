/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, h = n, mid = 0;
        while(l < h)
        {
            mid = l + (h-l)/2;
            if(!isBadVersion(mid))
            {
                l = mid + 1;
            }
            else
            {
                h = mid;
            }
        }
        return l;
    }
}