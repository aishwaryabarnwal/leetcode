class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0, r = 0, maxCount = 0;
        int len = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        while(r < n)
        {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            maxCount = Math.max(maxCount, map.get(ch));
            while((r -l + 1) - maxCount > k)
            {
                char lch = s.charAt(l);
                map.put(lch, map.get(lch)-1);
                l++;
            }
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}