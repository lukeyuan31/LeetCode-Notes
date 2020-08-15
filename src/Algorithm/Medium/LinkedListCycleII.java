/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        if(head==null){
            return null;
        }
        ListNode pointer=head;
        while(!set.contains(pointer)){
            set.add(pointer);
            if(set.contains(pointer.next)){
                return pointer.next;
            }
            
            if(pointer.next!=null){
                pointer=pointer.next;
            }
        }
        return null;
    }
}
