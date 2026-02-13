class LRUCache {

    class Node 
    {
        int key, value;
        Node prev, next;

        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }
    private Map<Integer, Node> map;
    private int capacity;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null)
            return -1;

        deleteNode(node);
        insertAfterHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertAfterHead(node);
        }   
        else
        {
            //capacity full
            if(map.size() >= capacity)
            {
                Node node = tail.prev;
                map.remove(node.key);
                deleteNode(node);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            insertAfterHead(node);
        }        
    }

    public void insertAfterHead(Node node)
    {
        Node currAfterHead = head.next;
        head.next = node;
        node.prev = head;
        node.next = currAfterHead;
        currAfterHead.prev = node;

    }

    public void deleteNode(Node node)
    {
        Node prevNode = node.prev;
        Node afterNode = node.next;
        prevNode.next = afterNode;
        afterNode.prev = prevNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */