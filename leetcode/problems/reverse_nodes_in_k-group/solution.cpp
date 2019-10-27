/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
      ListNode dummy(0), *cur = &dummy;
        dummy.next = head;
        while(cur->next) {  
            int m = k;
            ListNode* tmp = reverse(cur, m);
            if(m > 0)
                cur = reverse(cur, k);
            else
                cur = tmp;
        }
        return dummy.next;
    }
    
    ListNode* reverse(ListNode* prev, int& k) {
        //reverse the k nodes behind prev and return the tail
        ListNode* tail = prev->next;
        while(--k && tail->next) {
            ListNode* tmp = prev->next;
            prev->next = tail->next;
            tail->next = tail->next->next;
            prev->next->next = tmp;
        }
        return tail;
    }
};