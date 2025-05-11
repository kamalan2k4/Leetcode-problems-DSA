/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        if(headA==null || headB==null)
        return null;
        while(a!=b)
        {
            if(a==null)a=headB;
            else
            a=a.next;
            if(b==null)b=headA;
            else
            b=b.next;
        }
        
        return a;
        
    }
}