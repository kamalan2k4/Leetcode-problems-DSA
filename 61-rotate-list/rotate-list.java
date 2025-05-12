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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        return head;
        ListNode temp=head;
        int i=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            i++;

        }
        
        temp.next=head;
        k=k%i;
        int end=i-k;
        while(end--!=0)
        {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        
       
        return head;
    }
}