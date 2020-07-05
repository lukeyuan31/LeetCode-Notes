package 牛客网.剑指offer;

import java.util.ArrayList;
class ListNode {
       int val;
        ListNode next = null;
        ListNode(int val) { this.val = val;
        }
    }

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> array=new ArrayList<>();
        if(listNode==null){
            return array;
        }
        ListNode pre=null;
        ListNode result=new ListNode(0);
        result.next=listNode;
        ListNode pointer=listNode;
        ListNode next;


        while(pointer.next!=null){
            next=pointer.next;
            pointer.next=pre;
            pre=pointer;
            pointer=next;
        }

        pointer.next=pre;

        while(pointer!=null){
            array.add(pointer.val);
            pointer=pointer.next;
        }

        return array;



    }
}