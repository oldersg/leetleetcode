public class RemoveNthNode {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    static public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode c = new ListNode(-1);
        c.next = head;
        ListNode a = head;
        ListNode d = c;
        while (n>0)
        {
            n--;
            a = a.next;
        }
        ListNode b = head;
        while (a!=null)
        {
            d = d.next;
           a =  a.next;
           b =  b.next;
        }
        d.next = b.next;
        return c.next;
    }
}
