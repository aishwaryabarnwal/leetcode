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
    public boolean isPalindrome(ListNode head) {
        boolean res = true;
        ListNode slow = head, fast = head;
        ListNode mid, temp;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;
        slow = slow.next;
        mid.next = null;
        while(slow!=null)
        {
            temp = slow.next;
            slow.next = mid;
            mid = slow;
            slow = temp;

        }
        fast = head;
        slow = mid;
        while (slow != null) {
            if (fast.val != slow.val) 
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return res;
    }
}