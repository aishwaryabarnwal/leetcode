class Solution {
    public int maxVowels(String s, int k) {
        int maxVowel = Integer.MIN_VALUE;
        int i = 0, j = 0, count = 0;
        boolean [] isVowel = new boolean[128]; //super fast (O(1))
        for(char ch : "aeiouAEIOU".toCharArray())
        {
            isVowel[ch] = true;
        }
        while(j < s.length())
        {
            if(isVowel[s.charAt(j)])
                count++;
            if(j-i+1 == k)
            {
                if (count > maxVowel) 
                    maxVowel = count;
                if (maxVowel == k)
                    return k;
                if(isVowel[s.charAt(i)])
                    count--;
                i++;
            }
            j++;
        }
        return maxVowel;
    }
}