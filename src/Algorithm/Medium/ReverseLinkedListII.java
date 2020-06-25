package Algorithm.Medium;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int counter=0;
        ListNode result=new ListNode(0);
        result.next=head;

        //ListNode pointer=result;
        ListNode former=result;
        for(int i=0;i<m-1;i++){
            former=former.next;
            //pointer=pointer.next;
        }

        ListNode pointer=former.next;
        ListNode next=pointer.next;

        for(int i=0;i<n-m;i++){
            pointer.next=next.next;
            next.next=former.next;
            former.next=next;
            next=pointer.next;
        }


        return result.next;
    }
}
