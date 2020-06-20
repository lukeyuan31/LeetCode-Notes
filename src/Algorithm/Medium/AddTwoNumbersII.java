package Algorithm.Medium;
import java.util.Stack;

public class AddTwoNumbersII {
    public Stack<Integer> toStack(ListNode pointer){
        Stack<Integer> result=new Stack<>();
        while (pointer!=null){
            result.push(pointer.val);
            pointer=pointer.next;
        }
        return result;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1=toStack(l1);
        Stack<Integer> stack2=toStack(l2);
        Stack<Integer> result=new Stack<>();
        int carry=0;
        int count=1;

        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if (stack1.isEmpty()){
                int temp1=stack2.pop()+carry;
                if (temp1>=10){
                    result.push(temp1-10);
                    carry=1;
                }else {
                    result.push(temp1);
                    carry=0;
                }
            }
            else if (stack2.isEmpty()){
                int temp2=stack1.pop()+carry;
                if (temp2>=10){
                    result.push(temp2-10);
                    carry=1;
                }else {
                    result.push(temp2);
                    carry=0;
                }
            }else {
                int temp=stack1.pop()+stack2.pop()+carry;
                if (temp>=10){
                    result.push(temp-10);
                    carry=1;
                }else {
                    result.push(temp);
                    carry=0;
                }
            }
        }
        if(carry==1){
            result.push(1);
        }

        ListNode dummy=new ListNode(0);
        ListNode res=dummy;

        while (!result.isEmpty()){
            dummy.next=new ListNode(result.pop());
            dummy=dummy.next;
        }
        return res.next;
    }
}
