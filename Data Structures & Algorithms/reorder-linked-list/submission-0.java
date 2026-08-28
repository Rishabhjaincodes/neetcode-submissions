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
        if(fast==null||fast.next==null){
            return;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
       ListNode n = slow.next;
       slow.next = null;

       ListNode prv = null;

        while (n != null) {
         ListNode tmp = n.next;
         n.next = prv;
         prv = n;
          n = tmp;
        }
        

        while(prv!=null){
            ListNode temp1 = head.next;
            ListNode temp2 = prv.next;

            head.next = prv;
            prv.next = temp1;

            head = temp1;
            prv = temp2;
        }
       
    }
}
