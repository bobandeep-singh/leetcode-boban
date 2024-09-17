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
        if(null == head){
            return head;
        }
        if(null == head.next){
            return head;
        }
        ListNode tail = head;
        while(null != tail.next){
            if(tail.val == tail.next.val){
                tail.next = tail.next.next;
            } else{
                tail = tail.next;
            }
        }
        return head;
    }
}