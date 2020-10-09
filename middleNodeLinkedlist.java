// We have used Floyd's hare and tortoise algorithm; solves in O(N) time. N is the length of LinkedList.

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        
        }
        return slow;
    }
}
