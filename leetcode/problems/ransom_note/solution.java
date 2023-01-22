class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int[] alphabet = new int[26];
        if(ransomNote.length()>magazine.length()) return false;
        for(Character ch:magazine.toCharArray()){
            alphabet[ch - 'a']++;
        }
        for(Character ch:ransomNote.toCharArray()){
            //checking before subtracting 
            if(alphabet[ch - 'a'] == 0) return false;
            alphabet[ch - 'a']--;
            
        }
        return true;
    }
}