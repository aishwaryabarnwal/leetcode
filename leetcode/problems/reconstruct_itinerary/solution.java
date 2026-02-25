class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();

        for(List<String> ticket : tickets)
        {
            String from = ticket.get(0);
            String to = ticket.get(1);

            graph.putIfAbsent(from, new PriorityQueue<>());
            graph.get(from).offer(to);
        }

        List<String> result = new LinkedList<>();
        dfs("JFK", graph, result);
        return result;

    }

    public void dfs(String airport, Map<String, 
        PriorityQueue<String>> graph, List<String> result)
    {

        PriorityQueue<String> dest = graph.get(airport);
        while(dest != null && !dest.isEmpty())
        {
            String nextDest = dest.poll();
            dfs(nextDest, graph, result);
        }
        // Add after visiting children
        result.add(0, airport);
    }
}