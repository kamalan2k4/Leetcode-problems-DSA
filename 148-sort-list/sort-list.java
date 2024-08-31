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
    public ListNode sortList(ListNode head) {
        if(head==null|| head.next==null)
        return head;
        ListNode middle=find_middle(head);
        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;
        left= sortList(left);
        right=sortList(right);

        return mergeSortLL(left,right);
    }
    ListNode find_middle(ListNode head)
    {
        if(head==null|| head.next==null)
        return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode mergeSortLL(ListNode list1,ListNode list2)
    {
        ListNode cur= new ListNode(0);
        ListNode fin = cur;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
            {
                cur.next=list1;
                list1=list1.next;
                cur=cur.next;
            }
            else
            {
                cur.next=list2;
                list2=list2.next;
                cur=cur.next;
            }
        }
        if(list1!=null)
        {
            cur.next=list1;

        }
        else{
            cur.next=list2;
        }
        return fin.next;

    }
}