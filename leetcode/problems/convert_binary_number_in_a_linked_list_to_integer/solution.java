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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        //int arr = new int[];
        int sum = 0;
        while(temp!=null)
        {
            sum *= 2;
            sum += temp.val;
            temp = temp.next;
           
        }
        return sum;
    }
}