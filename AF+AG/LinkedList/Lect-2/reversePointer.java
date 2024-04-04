public class reversePointer {
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

    public ListNode reverseList(ListNode head) {
        ListNode prev=head;
        if(head==null){
            return head;
        }
        ListNode curr=prev.next;
        
        while(curr!=null){

            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        head.next=null;
        head=prev;
        
        return head;

        
    }
}

