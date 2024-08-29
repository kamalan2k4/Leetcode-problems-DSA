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
        ListNode temp=head;
        // ListNode front=head.next;
        ListNode dummy=null;

        while(temp!=null)
        {
            // Listnode temp=cur.next;
           ListNode front =temp.next;
            temp.next=dummy;
            dummy=temp;
            temp=front;
        }
        return dummy;

    }
}