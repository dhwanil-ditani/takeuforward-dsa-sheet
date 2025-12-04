/* Definition of singly Linked List:
class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode ones = new ListNode(-1);
        ListNode twos = new ListNode(-1);
        ListNode zeros = new ListNode(-1);

        ListNode onesCurr = ones;
        ListNode twosCurr = twos;
        ListNode zerosCurr = zeros;

        ListNode curr = head;

        while (curr != null) {
            if (curr.val == 0) {
                zerosCurr.next = new ListNode(curr.val);
                zerosCurr = zerosCurr.next;
            } else if (curr.val == 1) {
                onesCurr.next = new ListNode(curr.val);
                onesCurr = onesCurr.next;
            } else {
                twosCurr.next = new ListNode(curr.val);
                twosCurr = twosCurr.next;
            }
            curr = curr.next;
        }

        onesCurr.next = twos.next;
        zerosCurr.next = ones.next;
        head = zeros.next;
        return head;
    }
}