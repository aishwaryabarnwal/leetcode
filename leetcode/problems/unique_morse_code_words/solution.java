class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> map = new HashSet<>();
        for(String s : words)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++)
            {
                sb.append(morse[s.charAt(i) - 'a']);
            }
            map.add(sb.toString());
        }
        return map.size();
    }
}