class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0, r = 0, maxCount  = 0;
        int maxLen = Integer.MIN_VALUE;
        int[] freq = new int[26];
        while(r < n)
        {
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            maxCount = Math.max(maxCount, freq[ch - 'A']);
            while(r-l+1 - maxCount > k)
            {
                char lCh = s.charAt(l);
                freq[lCh - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
        
    }
}