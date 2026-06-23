public class Solution {
    public boolean hasCycle(ListNode head) {
       /* ArrayList<ListNode> visited=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            if(visited.contains(curr)){
                return true;
            }
            visited.add(curr);
            curr=curr.next;
        }
        return false;
        */

        ListNode left=head;
        ListNode right=head;
        while(right !=null && right.next!=null){
            left=left.next;
            right=right.next.next;

            if(right==left){
                return true;
            }
        }
        return false;
    }
}