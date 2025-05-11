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
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode front=head.next;
            head.next=prev;
            prev=head;
            head=front;
        }
        return prev;

    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        while(newHead!=null)
        {
            if(head.val!=newHead.val)
            return false;
            head=head.next;
            newHead=newHead.next;
        }
        return true;
    }
}