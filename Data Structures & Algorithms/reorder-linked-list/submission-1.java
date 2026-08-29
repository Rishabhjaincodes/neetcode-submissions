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
    public void reorderList(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       ListNode tmp=head;
       //getting mid
       while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode half=slow.next;
       slow.next=null;
       ListNode prv=null;
       ListNode temp=half;
       while(half!=null){
        temp=half.next;
        half.next=prv;
        prv=half;
        half=temp;
       }
       while(prv!=null){
        ListNode temp1=prv.next;
        ListNode temp2=head.next;
        head.next=prv;
        prv.next=temp2;
        head=temp2;
        prv=temp1;
       }
    }
}
