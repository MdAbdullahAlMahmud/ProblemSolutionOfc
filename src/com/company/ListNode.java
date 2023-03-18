package com.company;

import javax.swing.*;

public class ListNode {
    int val ;
    ListNode next;

    public ListNode() {}

    private ListNode head  = null ;

    public  void insert(int val){

        if (head == null){
            ListNode listNode = new ListNode();
            listNode.val = val;
            listNode.next = null;
        }

        ListNode tempNode = new ListNode();
        tempNode = head;

        while (tempNode != null ){
            tempNode = tempNode.next;
        }
        tempNode.val = val;
        tempNode.next = null;

    }


    public void printAllListNode(){
        ListNode listNode = head;
        while (listNode.next!=null){
            System.out.print(" " + listNode.val);
        }

    }
}
