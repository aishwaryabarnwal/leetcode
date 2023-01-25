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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode prev = list1, curr = list2;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(prev != null && curr != null)
        {
            if(prev.val <= curr.val)
            {
                temp.next = prev;
                prev = prev.next;
                temp= temp.next;
            }
            else
            {
                temp.next = curr;
                curr = curr.next;
                temp = temp.next;
            }
        }
        if(prev != null)
        {
            temp.next = prev;
        }
        if(curr != null)
        {
            temp.next = curr;
        }
        return dummy.next;

    }
}