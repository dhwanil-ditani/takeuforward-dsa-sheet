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
        ListNode curr = head;
        ListNode result = new ListNode();
        ListNode currResult = result;

        int i = 0;
        while (curr != null) {
            if (i % 2 == 0) {
                currResult.next = new ListNode(curr.val);
                currResult = currResult.next;
            }
            curr = curr.next;
            i++;
        }

        curr = head;
        i = 0;
        while (curr != null) {
            if (i % 2 != 0) {
                currResult.next = new ListNode(curr.val);
                currResult = currResult.next;
            }
            curr = curr.next;
            i++;
        }

        return result.next;
    }
}