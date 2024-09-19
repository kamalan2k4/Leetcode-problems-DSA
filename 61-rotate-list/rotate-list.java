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
        if(head==null||head.next==null||k==0)
        return head;
        int l=1;
        ListNode temp= head;
        while(temp.next!=null)
        {
            l++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%l;
        int end=l-k;
        // end++;
        while(end!=0)
        {
           temp=temp.next;
           end--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}