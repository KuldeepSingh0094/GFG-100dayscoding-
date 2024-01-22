package day71;
import java.util.*;
class Solution{
    
    static Node addTwoLists(Node first, Node second){
       Stack s1 = new Stack();
       Stack<Integer> s2 = new Stack<Integer>();
       Node temp =first;
       while(temp !=null){
           s1.push(temp.data);
           temp = temp.next;
       }
       temp = second;
       while(temp !=null){
           s2.push(temp.data);
           temp = temp.next;
       }
       Node head = null;
       int carry =0;
       while(!s1.isEmpty() && !s2.isEmpty()){
           int a = (int)s1.pop();
           int b = (int)s2.pop();
           int sum = a+b + carry;
           if(sum >9){
              carry = 1;
              head = addFirst(sum%10, head);
           }else{
              carry =0;
              head = addFirst(sum, head);
           }
       }
       
       
       
       
       while(!s1.isEmpty()){
          int sum = (int)s1.pop() + carry;
           if(sum >9){
              carry = 1;
              head = addFirst(sum%10, head);
           }else{
              carry =0;
              head = addFirst(sum, head);
           }
       }
       while(!s2.isEmpty()){
            int sum = (int)s2.pop() + carry;
           if(sum >9){
              carry = 1;
              head = addFirst(sum%10, head);
           }else{
              carry =0;
              head = addFirst(sum, head);
           }
       }
       if (carry==1){
           head = addFirst(carry, head);
       }
       return head;
    }
    
    static Node addFirst(int data, Node head){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
        }else{
            nn.next = head;
            head = nn;
        }
        return head;
    }
}