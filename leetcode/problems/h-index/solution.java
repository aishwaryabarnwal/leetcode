class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int h = 0;
        Arrays.sort(citations);
        for(int i=0;i<n;i++)
        {
            int paper = n - i;
            int currentH = Math.min(citations[i], paper);
            h = Math.max(h, currentH);
            if (citations[i] >= paper) { // no higher H-index possible
            break;
            }
        }
        return h;
    }
}