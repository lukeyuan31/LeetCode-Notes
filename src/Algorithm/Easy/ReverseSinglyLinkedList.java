package Algorithm.Easy;

//import Algorithm.Medium.ListNode;

public class ReverseSinglyLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode result=head;
            ListNode pointer=head;
            if(head==null){
                return null;
            }
            else{
                while(pointer.next!=null){
                    ListNode temp=pointer.next;
                    pointer.next=pointer.next.next;
                    temp.next=result;
                    result=temp;
                }
                return result;
            }
        }
    }
}
