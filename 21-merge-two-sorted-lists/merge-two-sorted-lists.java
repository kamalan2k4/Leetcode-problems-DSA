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
        ListNode i1=list1;
        ListNode i2=list2;
        ListNode dummy= new ListNode();
        ListNode newhead=dummy;
        while(i1 !=null && i2!=null)
        {
            if(i1.val<=i2.val)
            {dummy.next=i1;
            // dummy=i2;
            i1=i1.next;
            }
            else
            {
                dummy.next=i2;
                // dummy=i1;
                i2=i2.next;

            }
            dummy=dummy.next;
        }
        if(i1!=null)
        {
            // while(i1!=null)
            // {
                dummy.next=i1;
                // dummy=i1;
                // i1=i1.next;
            // }
        }
        else
        {
            // while(i2!=null)
            // {
                dummy.next=i2;
                // dummy=i2;
                // i2=i2.next;
            // }
        }
        return newhead.next;

    }
}