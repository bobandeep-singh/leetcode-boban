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

        ListNode output = new ListNode();
        ListNode tail = output;

        while(null != list1 && null != list2){
            if(list1.val < list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1. next;
            } else{
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }
        if(null == list1){
            tail.next = list2;
        }
        if(null == list2){
            tail.next = list1;
        }
        return output.next;
    }
}