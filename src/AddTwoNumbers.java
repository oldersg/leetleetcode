public class AddTwoNumbers {

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

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int t = 0;
            ListNode node = new ListNode(-1);
            ListNode head = node;
            while (l1!=null||l2!=null||t>0)
            {
                int val = t;
                if(l1!=null)
                {
                    val+=l1.val;
                    l1 = l1.next;
                }
                if(l2!=null)
                {
                    val+=l2.val;
                    l2 = l2.next;
                }
                t = val/10;
                val = val%10;
                head.next = new ListNode(val);
                head = head.next;
            }
            return node.next;
        }
    }
}
