class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
                res.add(i-1, "FizzBuzz");
            else if(i % 3 == 0)
                res.add(i-1, "Fizz");
            else if(i % 5 == 0)
                res.add(i-1, "Buzz");
            else
            {
                res.add(i-1, Integer.toString(i)); 
            }

        }
        return res;
        
    }
}