class Solution {
    public String minWindow(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();
        int l = 0, r  = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        StringBuilder sb = new StringBuilder();
        int[] freqS = new int[256];
        int[] freqT = new int[256];
        for (char c : t.toCharArray()) {
            freqT[c]++;
        }
        while(r < n1)
        {
            char ch = s.charAt(r);

            // add char into window
            if (freqT[ch] > 0) {
                if (freqS[ch] < freqT[ch]) {
                    n2--; // satisfied one more char
                }
            }
            freqS[ch]++;
            r++;

            // shrink from left if all chars matched
            while (n2 == 0) {
                if (r - l < minLen) {
                    minLen = r - l;
                    minStart = l;
                }

                char leftChar = s.charAt(l);
                freqS[leftChar]--;
                if (freqT[leftChar] > 0 && freqS[leftChar] < freqT[leftChar]) {
                    n2++; // we lost a needed char
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}