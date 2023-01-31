class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res =  new ArrayList<>();
        
        for(int i=0;i<numRows;i++)
        {
            List<Integer> inRes = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    inRes.add(1);
                else
                {
                    inRes.add(res.get(i-1).get(j-1)+ res.get(i-1).get(j));
                }
                
            }
            res.add(inRes);
        }
        return res;
    }
}