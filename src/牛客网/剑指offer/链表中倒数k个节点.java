package 牛客网.剑指offer;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        int length=0;

        ListNode dummy=head;
        while(dummy!=null){
            length++;
            dummy=dummy.next;
        }

        if(k>length){
            return null;
        }

        ListNode pointer=head;

        for(int i=1;i<=length-k;i++){
            pointer=pointer.next;
        }

        return pointer;
    }
}