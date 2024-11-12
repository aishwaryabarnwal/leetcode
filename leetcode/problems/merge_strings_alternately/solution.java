class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        int n = Math.max(n1, n2);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(n1>0)
            {
                sb.append(word1.charAt(i));
                n1--;
            }
            if(n2>0)
            {
                sb.append(word2.charAt(i));
                n2--;
            }
        }
        return sb.toString();
    }
}