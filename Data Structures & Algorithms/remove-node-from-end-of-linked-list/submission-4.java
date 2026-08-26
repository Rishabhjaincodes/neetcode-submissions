class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move fast n steps
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // n == length → remove head
        if (fast == null) {
            return head.next;
        }

        // Move until fast reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove slow.next
        slow.next = slow.next.next;

        return head;
    }
}

