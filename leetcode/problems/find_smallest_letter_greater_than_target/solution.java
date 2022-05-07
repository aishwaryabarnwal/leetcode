class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, h =letters.length - 1;
        char res = letters[0];
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            if(letters[mid] <= target)
                l = mid + 1;
            else
            {
                res = letters[mid];
                h = mid - 1;
            }
        }
        return res;
    }
}