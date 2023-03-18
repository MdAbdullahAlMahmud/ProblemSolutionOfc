package com.company.leetcode;
public class RemoveNthNode {


    public static void main(String[] args) {
        ListNode listNode = new ListNode();

        listNode.insert(1);
        listNode.insert(2);
        listNode.insert(3);
        listNode.insert(4);
        listNode.insert(5);


       ListNode tempNode =  removeNthFromEnd(listNode.head,2);

       while (tempNode !=null){
           System.out.print(" " + tempNode.val);
           tempNode = tempNode.next;
       }





    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int totalLength = 0 ;

        ListNode tempNode = head;


        while (tempNode !=null){
            totalLength ++;
            tempNode = tempNode.next;
        }

        if (n == totalLength){
            return  head.next;
        }

        int middle = totalLength / 2 ;

        ListNode currentNode=head;
        ListNode previousNode=null;
        int index = 0 ;
        while (currentNode !=null){
            index ++;
            previousNode = currentNode;
            currentNode = currentNode.next;

            if (index == middle+1 ){
                System.out.println(" Current " + currentNode.val);
                System.out.println(" Previous " + previousNode.val);
                //previousNode.next = currentNode.next;
            }
        }

        return  head;

    }




}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {

    }


    ListNode head = null;
    ListNode current = null;

    public void insert(int val) {

        if (head == null) {
            ListNode node = new ListNode();
            node.val = val;
            node.next = null;
            head = node;
            current = head;
        } else {

            ListNode node = new ListNode();
            node.val = val;


            node.next = current;
            current = node;

        }


    }
}