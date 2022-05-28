class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        String[] res = new String[n];
	    // StringBuilder sb = new StringBuilder(); 
	    // int i = 0;
	    // for(String temp : arr)
	    // {
	    // i = (temp.charAt(temp.length() - 1) - '0');
	    // res[i-1] = temp.substring(0, temp.length() - 1);
	    // }
	    // for(i=0;i<n-1;i++)
	    // {
	    // sb.append(res[i]).append(" ");
	    // }
	    // sb.append(res[i]);
	    // return sb.toString();
        for (String word : arr) {
            int i = word.length() - 1;
            res[word.charAt(i) - '1'] = word.substring(0, i);
        }
        return String.join(" ", res);
    }
}