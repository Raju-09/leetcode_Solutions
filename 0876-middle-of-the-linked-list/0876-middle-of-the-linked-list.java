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
    public ListNode middleNode(ListNode head) {  
        /*
        ListNode curr=head;
        int count =0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int mid=count/2;

        curr = head;
        for (int i = 0; i < mid; i++) {
            curr = curr.next;
        }
    
        return curr;*/
        ListNode left=head;
        ListNode right=head;
        while(right!=null && right.next!=null){
            left=left.next;
            right=right.next.next;
        }
        return left;
    }
}