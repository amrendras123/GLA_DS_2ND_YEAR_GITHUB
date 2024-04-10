/**
 * Delete_Middle
 */
public class Delete_Middle {

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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode slow_prev=null;

        while(fast!=null&&fast.next!=null){
             slow_prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        slow_prev.next=slow.next;
        return head;
        
    }
}
}