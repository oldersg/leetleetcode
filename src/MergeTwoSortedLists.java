public class MergeTwoSortedLists {
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode node = new ListNode(-1);
            ListNode head = node;
            while (list1!=null&&list2!=null)
            {
                if(list1.val>list2.val)
                {
                    head.next = list2;
                    list2 = list2.next;
                }
                else
                {
                    head.next = list1;
                    list1 = list1.next;
                }
                head = head.next;
            }
            if(list1!=null)
                head.next = list1;
            if(list2!=null)
                head.next = list2;
            return node.next;
        }
    }
}
