package Algorithm.Medium;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        int counter=0;
        ListNode dummyPointer=head;
        ListNode pointer=head;
        //ListNode result=new ListNode(0);
        //result.next=head;

        while(dummyPointer!=null){
            if(counter%2==1){
                pointer=pointer.next;
            }
            dummyPointer=dummyPointer.next;
            counter++;
        }


        //ListNode next=pointer.next;
        ListNode pre=null;
        ListNode temp;

        while(pointer!=null){
            temp=pointer.next;
            pointer.next=pre;
            pre=pointer;
            pointer=temp;
        }

        dummyPointer=head;
        ListNode halfPointer=pre;

        while(halfPointer.next!=null){
            ListNode next1=dummyPointer.next;
            //ListNode next2=halfPointer.next;
            dummyPointer.next=halfPointer;
            dummyPointer=next1;

            next1=halfPointer.next;
            halfPointer.next=dummyPointer;
            halfPointer=next1;
        }

        //return result.next;


    }
}
