package com.company;

public class BubbleSort {
    int[] arr;
    BubbleSort(int[] arr){
        this.arr =arr;
    }


    public  int[] sort(){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return  arr;
    }


    public void  print(){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
