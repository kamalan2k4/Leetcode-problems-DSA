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
    public ListNode middleNode(ListNode head) {
         int length=0;
        ListNode t=head;
        while(t!=null){
            length++;
           t=t.next;
        }
        int mid=length/2;
       ListNode temp=head;
       int count=0;
       while(count<mid){
           temp=temp.next;
           count++;
       }
       return temp;
        
    }
}