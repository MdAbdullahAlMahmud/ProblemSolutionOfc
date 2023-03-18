package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int arr [] = {4,5,6,8,9,8,7,4,5,9,5,8,65};

        BubbleSort bubbleSort = new BubbleSort(arr);
        int sortedArr[] = bubbleSort.sort();
        bubbleSort.print();




    }
}
