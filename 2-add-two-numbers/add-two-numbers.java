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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int bal=0;
         ListNode b=new ListNode();
        //  ListNode l= new ListNode();
         ListNode head=b;
        //  l.next=head;
        while(l1!=null || l2 != null || bal==1)
        {
              int sum= bal;
              if(l1!=null)
              {
                sum+=l1.val;
                l1=l1.next;
              }
              if(l2!=null)
              {
              sum+=l2.val;
              l2=l2.next;
              }
              ListNode node=new ListNode(sum%10);
              bal=sum/10;
              head.next=node;
              head=head.next;
              
            //   l1=l1.next;
            //   l2=l2.next;
            //   l=l.next;

        }
       
        
        return b.next;

    }
}