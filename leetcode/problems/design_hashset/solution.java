class MyHashSet {

    int[] temp;
    public MyHashSet() {
        temp = new int[1000001];
    }
    
    public void add(int key) {
        temp[key] = 1;
    }
    
    public void remove(int key) {
        temp[key] = 0;
    }
    
    public boolean contains(int key) {
        if(temp[key] == 0) 
            return false;
        else 
            return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */