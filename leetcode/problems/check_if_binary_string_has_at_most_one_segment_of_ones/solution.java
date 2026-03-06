class Solution {
    public boolean checkOnesSegment(String s) {
        int segments = 0;

        for(int i = 0; i < s.length(); i++) {
            //// as 10011 is false and no leading zero
            if(s.charAt(i) == '1' && (i == 0 || s.charAt(i-1) == '0')) {
                segments++;
            }

            if(segments > 1)
                return false;
        }

        return true;
    }
}