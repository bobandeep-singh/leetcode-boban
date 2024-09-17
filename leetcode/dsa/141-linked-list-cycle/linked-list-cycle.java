/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(null == head){
            return false;
        }
        if(null == head.next){
            return false;
        }
        ListNode h1 = head;
        ListNode h2 = head.next;
        while(null != h2.next && null != h2.next.next){
            if(h1 == h2.next){
                return true;
            }
            h1 = h1.next;
            h2 = h2.next.next;
        }
        return false;
    }
}