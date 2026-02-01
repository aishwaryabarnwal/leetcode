class Solution {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int[] tfreq = new int[256];
        int[] sfreq = new int[256];
        if(tLen > sLen)
            return "";

        for(char ch : t.toCharArray())
            tfreq[ch]++;
        
        int l = 0, r = 0, size = tLen, minStart = 0;
        int minLen = Integer.MAX_VALUE;
        while(r < sLen)
        {
            char ch = s.charAt(r);
            sfreq[ch]++;
            if(tfreq[ch] > 0 && sfreq[ch] <= tfreq[ch])
                size--;
            
            while(size == 0)
            {
                 if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minStart = l;
                }
                char lCh = s.charAt(l);
                sfreq[lCh]--;
                if(tfreq[lCh] > 0 && sfreq[lCh] < tfreq[lCh])
                    size++;
                l++;
            }
            r++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}