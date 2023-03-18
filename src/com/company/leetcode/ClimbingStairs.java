package com.company.leetcode;

public class ClimbingStairs {


    public static void main(String[] args) {

        System.out.println("Ans " + climbStairs(5) );
    }



    public static int climbStairs(int n) {


        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;


        for (int i = 3; i <=n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];

      /*  for (int i = 1; i <= n; i++) {
            System.out.print( arr[i] + " ");
        }*/


    }
}
