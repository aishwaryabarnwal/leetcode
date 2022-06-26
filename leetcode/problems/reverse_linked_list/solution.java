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
        ListNode temp = head;
        ListNode rev = null;
        while(temp != null)
        {
            ListNode after = temp.next;
            temp.next = rev;
            rev = temp;
            temp = after;
            
        }
        return rev;
    }
}