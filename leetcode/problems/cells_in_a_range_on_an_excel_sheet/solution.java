class Solution {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0), c2 = s.charAt(3),
         r1 = s.charAt(1), r2 = s.charAt(4);
        List<String> cells = new ArrayList<>();
        for(char i=c1;i<=c2;i++)
        {
            for(char j=r1;j<=r2;j++)
            {
                cells.add(new String(new char[]{i, j}));
            }
        }
        return cells;
    }
}