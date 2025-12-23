class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode one = head;
        ListNode two = head;

        int i = 0;
        while (i < n) {
            one = one.next;
            i++;
        }

        if (one == null) {
            return head.next;
        }

        while (one.next != null) {
            one = one.next;
            two = two.next;
        }

        two.next = two.next.next;

        return head;
    }
}
