class LFUCache {

    class Node {
        int key, value, freq;
        Node prev, next;
        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }
    
    private int capacity;
    private int minFreq;

    private Map<Integer, Node> keyMap;
    private Map<Integer, DoublyLinkedList> freqMap;

    class DoublyLinkedList {
        Node head, tail;
        int size;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            
            head.next = tail;
            tail.prev = head;
        }

        void insertAfterHead(Node node)
        {
            Node currAfterHead = head.next;
            head.next = node;
            node.next = currAfterHead;
            node.prev = head;
            currAfterHead.prev = node;
            size++;
        }

        void deleteNode(Node node)
        {
            Node prevNode = node.prev;
            Node afterNode = node.next;
            prevNode.next = afterNode;
            afterNode.prev = prevNode;
            //or directly below
            // node.prev.next = node.next;
            // node.next.prev = node.prev;
            size--;
        }

        Node removeLast()
        {
            if(size > 0)
            {
                Node node = tail.prev;
                deleteNode(node);
                return node;
            }
            return null;
        }

    }
    public LFUCache(int capacity) {
        this.capacity = capacity;
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        if(!keyMap.containsKey(key))
            return -1;
        
        Node node = keyMap.get(key);
        updateFreq(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(capacity == 0)
            return;
        
        if(keyMap.containsKey(key))
        {
            Node node = keyMap.get(key);
            node.value = value;
            updateFreq(node);
            return;
        }

        if(keyMap.size() == capacity)
        {
            DoublyLinkedList list = freqMap.get(minFreq);
            Node remove = list.removeLast();
            keyMap.remove(remove.key);
        }
        Node node = new Node(key, value);
        minFreq = 1;

        DoublyLinkedList list = freqMap.getOrDefault(1, new DoublyLinkedList());
        list.insertAfterHead(node);

        freqMap.put(1,list);
        keyMap.put(key,node);
    }

    private void updateFreq(Node node) {

        int freq = node.freq;
        DoublyLinkedList list = freqMap.get(freq);

        list.deleteNode(node);

        if(freq == minFreq && list.size == 0)
            minFreq++;

        node.freq++;

        DoublyLinkedList newList =
                freqMap.getOrDefault(node.freq,new DoublyLinkedList());

        newList.insertAfterHead(node);
        freqMap.put(node.freq,newList);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */