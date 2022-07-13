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
            public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return listMerge(list1, list2);
    }

    public ListNode listMerge(ListNode l1, ListNode l2) {
        ListNode res;
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                res = l1;
                res.next = listMerge(l1.next, l2);
            } else {
                res = l2;
                res.next = listMerge(l1, l2.next);
            }
        }
        return res;
    }
}