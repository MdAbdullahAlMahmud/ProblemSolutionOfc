package com.company.leetcode;

import java.net.Inet4Address;
import java.util.Stack;

public class ImplementUsingQueueWithStack {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
       int param_2 = obj.pop();
    /*   int param_3 = obj.pop();
       int param_4 = obj.pop();
       int param_5 = obj.pop();
       int param_6 = obj.pop();*/
         /*int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println("Param 2 " + param_2);
        System.out.println("Param 3 " + param_3);
        System.out.println("Param 4 " + param_4);*/


        System.out.println("Peck " + obj.stack.firstElement());

        System.out.println("IsEmpty " + obj.empty());

        obj.stack.forEach(integer -> {
            System.out.println(" "  + integer);
        });





    }


}

class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> revStack;

    public MyQueue() {
        stack = new Stack<>();
        revStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

    }

    public int pop() {


        while (!stack.isEmpty()){
            int lastValue = stack.pop();
            revStack.push(lastValue);
        }
        int popValue = revStack.pop();

        while (!revStack.isEmpty()){
            int lastValue = revStack.pop();
            stack.push(lastValue);
        }



        return  popValue;

    }

    public int peek() {
        return stack.firstElement() ;

    }

    public boolean empty() {

        return stack.isEmpty();
    }
}