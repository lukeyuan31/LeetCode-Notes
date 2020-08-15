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
        if(head==null){
            return null;
        }
        ListNode pre=new ListNode(0);
        ListNode result=new ListNode(0);
        result=pre;
        pre.next=head;
        ListNode pointer=head;
        ListNode next=pointer.next;
        while(pointer!=null){
            if(pointer.val==val){
                pre.next=next;
                pointer=next;
                if(pointer!=null){
                    next=pointer.next;
                }
            }else{
                pre=pointer;
                pointer=next;
                if(pointer!=null){
                    next=pointer.next;
                }
            }
        }
        return result.next;
    }
}
