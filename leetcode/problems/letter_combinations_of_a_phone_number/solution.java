class Solution {
    
    private static final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno",
                                         "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        List<String> res = new ArrayList<>();
        if (digits == null || n == 0) 
            return res;
        backtrack(digits, res, 0, new StringBuilder());
        return res;
    }

    public void backtrack(String digits, List<String> res, int i, StringBuilder sb) {
        
        if(i==digits.length()) {
           res.add(sb.toString());
            return;
        } 
        String letters = map[digits.charAt(i) - '0'];
        for (char ch : letters.toCharArray()) {
            sb.append(ch);
            backtrack(digits, res, i + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}