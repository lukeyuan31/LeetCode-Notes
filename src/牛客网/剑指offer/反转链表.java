package 牛客网.剑指offer;

public class 反转链表 {
    /*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
    public class Solution {
        public ListNode ReverseList(ListNode head) {
            if(head==null){
                return null;
            }
            ListNode pre=null;
            ListNode pointer=head;
            ListNode next;


            while(pointer.next!=null){
                next=pointer.next;
                pointer.next=pre;
                pre=pointer;
                pointer=next;
            }

            pointer.next=pre;

            return pointer;

        }
    }
}
