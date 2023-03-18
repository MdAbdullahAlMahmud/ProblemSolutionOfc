package com.company.leetcode;

public class Converte1DInto2DArray {
    public static void main(String[] args) {

        int original[] = {1,2,3,4};
        int m = 2;
        int n = 2;
        int arr[][]  = construct2DArray(original,m,n);

        System.out.println(arr.length);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println("[ "+i + " , " + j + " ]  ==> "+arr[i][j] + " ");

            }
        }

    }


    public static int[][] construct2DArray(int[] original, int m, int n) {

        if (m*n != original.length)return  new int[][]{};

        int arr[][]  = new int[m][n];
        int index = 0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[index++];
            }
        }


        return  arr;
    }
}
