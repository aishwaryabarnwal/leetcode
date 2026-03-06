class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        return !s.contains("01");
    }
}