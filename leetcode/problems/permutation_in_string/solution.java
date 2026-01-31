class Solution {
   public boolean checkInclusion(String s1, String s2) {
        int k = s1.length(); //window size
        int n = s2.length();
        if(k > n)
            return false;
        int[] count = new int[26];
        
        //freq of s1
        for(char ch : s1.toCharArray())
            count[ch - 'a']++;

        int l = 0, r = 0;
        while(r < n)
        {
            // include s2[r]
            count[s2.charAt(r) - 'a']--;

            // shrink window
            if (r - l + 1 > k) {
                count[s2.charAt(l) - 'a']++;
                l++;
            }
             // check all zero
            if (r - l + 1 == k && allZero(count))
                return true;
            r++;
        }
        return false;
   }

    private boolean allZero(int[] count) {
        for (int c : count)
            if (c != 0) return false;
        return true;
    }
}