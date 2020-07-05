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
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null && list2==null){
            return null;
        }
        ListNode result=new ListNode(0);
        ListNode pointer=result;
        ListNode pointer1=list1;
        ListNode pointer2=list2;

        while(pointer1!=null || pointer2!=null){
            if(pointer1==null){
                pointer.next=new ListNode(pointer2.val);
                pointer2=pointer2.next;
            }
            else if(pointer2==null){
                pointer.next=new ListNode(pointer1.val);
                pointer1=pointer1.next;
            }
            else{
                if(pointer1.val<pointer2.val){
                    pointer.next=new ListNode(pointer1.val);
                    pointer1=pointer1.next;
                }
                else{
                    pointer.next=new ListNode(pointer2.val);
                    pointer2=pointer2.next;
                }
            }
            pointer=pointer.next;
        }

        return result.next;

    }
}