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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null || head.next==null)
        return null;
        ListNode cur=head;
        int count=1;
        while(cur.next!=null)
        {
            count++;
            cur=cur.next;
        }
        cur=head;
        if(count==2||count==n)
        {
            if(n==1)
            {
                cur.next=null;
                return head;
            }
            else
            {
                head=head.next;
                return head;
            }
        }
        int c=count-n;
        int i=1;
        
        while(i<c)
        {
           cur=cur.next;
           i++;
        }
        
        
        cur.next=cur.next.next;
        return head;
    }
}