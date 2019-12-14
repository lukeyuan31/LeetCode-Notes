package Algorithm;
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
     }
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode dummyPointer=result;
        ListNode pointer1=l1;
        ListNode pointer2=l2;
        ListNode temp;
        int addNum=0;
        int sum=0;
        while(pointer1!=null || pointer2!=null){
            if(pointer1==null){
                sum=pointer2.val+addNum;
                addNum=0;
                if(sum>=10){
                    addNum=1;
                    sum=sum-10;
                }
                temp=new ListNode(sum);
                dummyPointer.next=temp;
                dummyPointer=dummyPointer.next;
                pointer2=pointer2.next;
            }
            else if(pointer2==null){
                sum=pointer1.val+addNum;
                addNum=0;
                if(sum>=10){
                    addNum=1;
                    sum=sum-10;
                }
                temp=new ListNode(sum);
                dummyPointer.next=temp;
                dummyPointer=dummyPointer.next;
                pointer1=pointer1.next;
            }
            else{
                sum=pointer1.val+pointer2.val+addNum;
                addNum=0;
                if(sum>=10){
                    addNum=1;
                    sum=sum-10;
                }
                temp=new ListNode(sum);
                dummyPointer.next=temp;
                dummyPointer=dummyPointer.next;
                pointer1=pointer1.next;
                pointer2=pointer2.next;

            }
        }
        if (addNum>0){
            temp=new ListNode(addNum);
            dummyPointer.next=temp;
        }
        return result.next;
    }
}
