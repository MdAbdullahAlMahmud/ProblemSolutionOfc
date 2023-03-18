package com.company.leetcode;

import com.company.ListNode;

public class ReverseLinkList {

    int arr[] = {1,2,3,4,5,6};

    public static void main(String[] args) {
        reverseArray(10);
        ListNode node = new ListNode();

        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);

        node.printAllListNode();

    }

    public  static  int reverseArray(int i ){

        if (i == 0)return  i;

        System.out.println(" " + i);

        return  reverseArray(i-1);

    }
}
