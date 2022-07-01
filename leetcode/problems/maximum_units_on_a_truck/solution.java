class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int value = 0, res = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for(int i=0;i<boxTypes.length;i++)
        {
            if(boxTypes[i][0] <= truckSize)
            {
                res +=  boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else if(truckSize != 0)
            {
                res += truckSize * boxTypes[i][1];
                truckSize = 0;
                break;
            } 
        }
        return res;
    }
}