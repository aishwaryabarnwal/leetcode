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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode rev = null;
        ListNode prev = head;
        ListNode curr = null;
        while(prev!=null)
        {
            curr = prev.next;
            prev.next = rev;
            rev = prev;
            prev = curr;
            
        }
        return rev;

    }
}