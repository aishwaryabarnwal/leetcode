class MedianFinder {

    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(left.isEmpty() || left.peek() >= num)
            left.add(num);
        else
            right.add(num);
        
        if(left.size() > right.size() + 1)
            right.add(left.poll());
        else if(left.size() < right.size())
            left.add(right.poll());
    }
    
    public double findMedian() {
        double median = 0;
        if(left.size() == right.size())
            median = (left.peek() + right.peek()) / 2.0;
        else
            median = left.peek();
        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */