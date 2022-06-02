class Solution {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char ch : tiles.toCharArray()) 
        {
            count[ch - 'A']++;
        }
        return tiles_count(count);
    }
    
    int tiles_count(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 26; i++) 
        {
            if (arr[i] == 0) 
            {
                continue;
            }
            sum++;
            arr[i]--;
            sum += tiles_count(arr);
            arr[i]++;
        }
        return sum;
    }
}