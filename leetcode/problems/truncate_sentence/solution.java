class Solution {
    public String truncateSentence(String s, int k) {
        String [] sentence = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<k-1;i++){
            res.append(sentence[i] +" ");
        }
        res.append(sentence[k-1]); 
        return res.toString();
    }
}