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
    public ListNode removeElements(ListNode head, int val) {
        
        while(null != head && head.val == val){
            head = head.next;
        }

        if(null == head){
            return head;
        }

        ListNode prev = head;
        ListNode nextNode = head.next;

        while(null != nextNode){
            System.out.println("++++++++++++++++");
            System.out.println("Prev: "+prev.val);
            System.out.println("NextNode: "+nextNode.val);
            if(val == nextNode.val){
                ListNode temp = prev;
                prev.next = nextNode.next;
                nextNode = nextNode.next;
            } else{
                prev = prev.next;
                nextNode = nextNode.next;
            }
        }
        return head;
    }
}