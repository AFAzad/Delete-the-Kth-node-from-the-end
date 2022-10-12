/* Problem Statement
Given a linked list consisting of N nodes and an integer K, your task is to delete the Kth node from the end of the linked list */

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteElement(Node head,int k) {
//enter your code here
   if(head == null){
       return null;
   }
   Node slow = head;
   Node fast = head;
   int count = 0;
   while(count <= k-1){
       fast = fast.next;
       count++;
   }
   if(fast == null){
       return head.next;
   }

   while(fast.next!= null){
       fast = fast.next;
       slow = slow.next;
   }
   slow.next = slow.next.next;
   return head;
}