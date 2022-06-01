class Solution {
    public String toLowerCase(String s) {
        //String res = s.toLowerCase();
        StringBuilder sb = new StringBuilder();        
        for (char c : s.toCharArray()) {            
            sb.append(c > 64 && c < 91 ? (char)(c + 32) : c);
        }
        return sb.toString();
        
    }
}