package Algorithm.Medium;

import java.util.HashMap;

public class CopyListwithRandomPointer {

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    class Solution {
        public Node copyRandomList(Node head) {
            Node oldHead=head;
            Node newHead=null;
            if(head==null){
                return null;
            }
            HashMap<Node,Node> hashmap=new HashMap<>();
            while(oldHead!=null){
                newHead=new Node(oldHead.val);
                hashmap.put(oldHead,newHead);
                oldHead=oldHead.next;
            }

            oldHead=head;
            while(oldHead!=null){
                newHead=hashmap.get(oldHead);
                newHead.next=hashmap.get(oldHead.next);
                newHead.random=hashmap.get(oldHead.random);
                oldHead=oldHead.next;
            }

            return hashmap.get(head);
        }
    }
}
