class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        String res = "";
        for(String w:words)
        {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            res += sb.toString() + " ";
        }
        return res.trim();
    }
}