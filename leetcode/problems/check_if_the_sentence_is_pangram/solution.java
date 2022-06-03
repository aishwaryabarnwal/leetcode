class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        if(n < 26)
            return false;
         Set<Character> map = new HashSet<>();
        for (int i=0;i<n;++i)
        {
            map.add(sentence.charAt(i));
        }   
        return map.size() == 26;
    }
}