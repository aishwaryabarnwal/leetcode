class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> currRow = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    currRow.add(1);
                else
                    currRow.add(res.get(j-1) + res.get(j));
            }
            res = currRow;
        }
        return res;
    }
}