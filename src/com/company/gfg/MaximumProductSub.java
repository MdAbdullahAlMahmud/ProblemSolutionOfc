package com.company.gfg;

public class MaximumProductSub {



    public static void main(String[] args) {

       int  N = 5;
        int Arr[] = {6, -3, -10, 0, 2};
        System.out.println("Max "+ maxProduct(Arr,N));
    }

    static long maxProduct(int[] arr, int n) {


        int maxProduct = arr[0];


        for (int i = 0; i < n-1; i++) {

            maxProduct = Math.max(maxProduct,maxProduct*arr[i+1]);

        }


        return maxProduct;
    }





}
