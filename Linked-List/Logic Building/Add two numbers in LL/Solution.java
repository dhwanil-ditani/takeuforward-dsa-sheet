/*Definition for singly Linked List
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
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode curr3 = result;

        int borrow = 0;

        while (curr1 != null && curr2 != null) {
            int n = curr1.val + curr2.val + borrow;
            curr3.next = new ListNode(n % 10);
            borrow = n / 10;
            curr3 = curr3.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while (curr1 != null) {
            int n = curr1.val + borrow;
            curr3.next = new ListNode(n % 10);
            curr3 = curr3.next;
            borrow = n / 10;
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            int n = curr2.val + borrow;
            curr3.next = new ListNode(n % 10);
            curr3 = curr3.next;
            borrow = n / 10;
            curr2 = curr2.next;
        }

        while (borrow != 0) {
            curr3.next = new ListNode(borrow % 10);
            curr3 = curr3.next;
            borrow = borrow / 10;
        }

        return result.next;
    }
}