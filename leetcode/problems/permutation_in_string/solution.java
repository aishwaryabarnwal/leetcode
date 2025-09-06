class Solution {
   public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Frequency of s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        int matches = 0;
        for (int k = 0; k < 26; k++) {
            if (count1[k] == count2[k]) matches++;
        }

        int i = 0, j = 0;
        int n = s2.length();
        int k = s1.length(); // window size

        while (j < n) {
            // expand: add s2[j]
            int idxR = s2.charAt(j) - 'a';
            count2[idxR]++;
            if (count2[idxR] == count1[idxR]) {
                matches++;
            } else if (count2[idxR] == count1[idxR] + 1) {
                matches--;
            }

            // ✅ when window size == k
            if (j - i + 1 == k) {
                if (matches == 26) return true;

                // shrink from left
                int idxL = s2.charAt(i) - 'a';
                count2[idxL]--;
                if (count2[idxL] == count1[idxL]) {
                    matches++;
                } else if (count2[idxL] == count1[idxL] - 1) {
                    matches--;
                }
                i++;
            }

            j++;
        }

        return false;
   }
}