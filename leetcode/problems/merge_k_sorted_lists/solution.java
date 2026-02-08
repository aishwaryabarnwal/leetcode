/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for(int k=0;k<lists.length;k++) //Add first node of each list
        {
            if(lists[k] != null)
                pq.offer(lists[k]);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(!pq.isEmpty())
        {
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;

            if(node.next != null)
                pq.offer(node.next);

        }

        return dummy.next;
    }
}