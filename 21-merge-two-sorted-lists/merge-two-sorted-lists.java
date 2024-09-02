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
        
        ListNode ans = new ListNode(-1);  // create a dummy node
        ListNode temp = ans;
        while(list1!=null && list2!=null){ //Merge List
            
            if(list1.val <= list2.val) {  // add the next pointer of temp to the smallest value after comparing both lists
                temp.next = list1;
                list1=list1.next;
            }
            else{
                temp.next = list2;
                list2=list2.next;
            }
            temp= temp.next;
        }
        if(list1 != null){  // if any one list is still remaining then point our temp.next pointer to it, so all the values ahead of the list will also be automatically attached.
            temp.next= list1;
        }else{
            temp.next= list2;
        }
        return ans.next; 
    }
}