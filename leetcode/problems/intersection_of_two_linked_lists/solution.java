/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        // tail of headA
        ListNode tail = headA;
        while(tail.next != null)
            tail = tail.next;

        // Create cycle
        tail.next = headB;

        //Detect cycle entry
        ListNode slow = headA, fast = headA;
        ListNode intersection = null;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                slow = headA;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                intersection = slow;
                break;
            }
        }

        // Restore list
        tail.next = null;

        return intersection;
    }
}