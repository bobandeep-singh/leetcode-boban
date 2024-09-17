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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = new ListNode();
        ListNode tail = sumList;
        int rem = 0;

        while((null != l1 || null != l2 || rem > 0)){
            int currSum = 0 + rem;
            
            if(l1 != null){
                currSum = currSum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                currSum = currSum + l2.val;
                l2 = l2.next;
            }
            // int currSum = l1.val + l2.val + rem;
            System.out.println("currSum: "+currSum);
            
            rem = currSum / 10;
            System.out.println("rem: "+rem);
            
            currSum = currSum % 10;
            System.out.println("currSum: "+currSum);
            
            tail.next = new ListNode(currSum);
            tail = tail.next;

        }
        // if(null == l1){
        //     tail.next = l2;
        // }
        // if(null == l2){
        //     tail.next = l1;
        // }

        return sumList.next;
        
    }
}