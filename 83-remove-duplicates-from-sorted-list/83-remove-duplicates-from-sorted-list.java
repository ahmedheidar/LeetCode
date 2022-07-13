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
    public ListNode deleteDuplicates(ListNode head) {
    ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode pointer = helper;
        if(head==null){
            return null;
        }
        while (pointer.next.next!=null){
            if(pointer.next.val==pointer.next.next.val){
                if(pointer.next.next.next!=null){
                    pointer.next.next= pointer.next.next.next;
                }else{
                    pointer.next.next = null;
                }
            }else{
                pointer = pointer.next;
            }
        }
        return helper.next;


    }
}