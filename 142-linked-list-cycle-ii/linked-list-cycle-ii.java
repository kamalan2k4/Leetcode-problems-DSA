/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // int l=0;
        // int l2=0;
        // ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            // l2++;
            if(slow==fast)
            {
                ListNode ptr=head;
                ListNode ptr2=slow;
                while(ptr!=ptr2)
                {
                    ptr=ptr.next;
                    ptr2=ptr2.next;
                }
                return ptr;
            }
        }
      
      return null;
        
    }
}