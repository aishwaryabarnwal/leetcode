class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Integer, Character> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<jewels.length();i++)
        {
            map.put(i, jewels.charAt(i));
        }
        for(int i=0; i<stones.length(); i++)
        {
            if( map.containsValue(stones.charAt(i)))
            {
                res++;
            }
        }
        return res;
        
        //return S.replaceAll("[^" + J + "]", "").length();
    }
}