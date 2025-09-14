class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        int r = ransomNote.length();
        int m = magazine.length();

        if(r > m)
            return false;
        for(char ch : magazine.toCharArray())
        {
            freq[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray())
        {
            if(freq[ch - 'a'] == 0)
                return false;
            freq[ch - 'a']--;
        }
        
        return true;
    }
}