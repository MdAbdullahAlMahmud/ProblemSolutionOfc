package com.company.leetcode;

public class PlusOne {

    public static void main(String[] args) {


        int arr [] = {9};
        int output[] = plusOne(arr);

        for (int i = 0; i < output.length; i++) {

            System.out.print(" "+ output[i]);
        }

    }

    public  static  int[] plusOne(int[] digits) {


        int n = digits.length - 1 ;
        for (int i = n  ; i >= 0; i--) {

            if (digits[i] < 9 ){
                digits[i] ++ ;
                return  digits;
            }
                digits[i] = 0;
        }
        int arr [] = new int[n+2];
        arr[0] = 1;
        return  arr;
    }


}
