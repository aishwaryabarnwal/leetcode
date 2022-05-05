class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //dif = (sum(A) - sum(B)) / 2
        // (a, b) with a = b + dif
        /*Sa -A + B = Sb -B+A
        2(A-B) = (Sa-Sb)
        A-B = (Sa-Sb)/2
        A = B+(Sa-Sb)/2
        */
        HashSet<Integer> map = new HashSet<>();
        int diff = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2;
        for(int a : aliceSizes)
        {
            map.add(a);
        } 
        for(int b : bobSizes)
        {
            if(map.contains(b + diff))
                return new int[] {b+diff, b};
        }
        return new int[0];
    }
}