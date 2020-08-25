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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode pointer=head;
        //ListNode result=head;
        ListNode result=new ListNode(0);
        ListNode pre=result;
        result.next=head;
        while(pointer!=null && pointer.next!=null){
            
            ListNode next=pointer.next;
            ListNode nnext=next.next;
            pre.next=next;            
            next.next=pointer;
            pointer.next=nnext;
            pre=pointer;
            pointer=nnext;
           
        }
        return result.next;
    }
}
