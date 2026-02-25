class Solution {
    public int[] sortByBits(int[] arr) {
        
        return Arrays.stream(arr).boxed().sorted((a,b) -> {
            int diff = Integer.bitCount(a) - Integer.bitCount(b);
            return diff == 0 ? a-b : diff;
        }).mapToInt(i -> i).toArray();
    }
}