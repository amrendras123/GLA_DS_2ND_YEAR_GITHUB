public class intersection_of_LL {
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode p1=headA;
            ListNode p2=headB;
    
           while(p1!=p2){
    
            p1=p1==null?headB:p1.next;
            p2=p2==null?headA:p2.next;
    
            // if(p1!=null){
            //     p1=p1.next;
            // }else{
            //     p1=headB;
            // }
            // if(p2!=null){
            //     p2=p2.next;
            // }else{
            //     p2=headA;
            // }
           } 
           return p1;
        }
    }
}
