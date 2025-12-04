/*
Definition for singly linked list:
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
    public ListNode oddEvenList(ListNode head) {

        if (head == null) return head;

        ListNode curr = head;
        ListNode result = new ListNode();
        ListNode currResult = result;

        while (curr != null) {
            currResult.next = new ListNode(curr.val);
            currResult = currResult.next;
            curr = curr.next;
            if (curr != null) {
                curr = curr.next;
            }
        }

        curr = head.next;
        while (curr != null) {
            currResult.next = new ListNode(curr.val);
            currResult = currResult.next;
            curr = curr.next;
            if (curr != null) {
                curr = curr.next;
            }
        }

        return result.next;
    }
}