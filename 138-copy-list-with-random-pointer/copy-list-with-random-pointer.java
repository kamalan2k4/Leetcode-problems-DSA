/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        return null;
        Node temp=head;
        while(temp!=null)
        {
            Node next=temp.next;
            temp.next=new Node(temp.val);
            temp.next.next=next;
            temp=next;
        }
        temp=head;
        while(temp!=null)
        {
          Node nr=temp.random;
          if(nr!=null)
          temp.next.random=nr.next;
          temp=temp.next.next;
        }
        temp=head;
        Node newHead=temp.next;
        Node p=newHead;
        while(temp!=null)
        {
            temp.next=(temp.next!=null)?temp.next.next:temp.next;
            p.next=(p.next!=null)?p.next.next:p.next;

            temp=temp.next;
            p=p.next;
        }
        return newHead;
    }
}