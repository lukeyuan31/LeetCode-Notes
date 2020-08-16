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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        Stack<ListNode> stack=new Stack<>();
        ListNode fast=head.next;
        ListNode slow=head;
        stack.push(slow);
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;   
            stack.push(slow);
        }
        if(fast==null){
            stack.pop();
        }
        slow=slow.next;
        while(!stack.isEmpty()){
            if(slow.val!=stack.peek().val){
                return false;
            }
            slow=slow.next;
            stack.pop();
        }
        return true;
    }
}
