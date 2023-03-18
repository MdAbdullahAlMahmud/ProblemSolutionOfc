package com.company.leetcode;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2}};
        int r = 1;
        int c = 1;
        int ans[][] = matrixReshape(arr,r,c);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print("[ "+i + " , " + j + " ]  ==> "+ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int length = mat.length;
        int eleLength =mat[0].length;
        int[] base = new int[length*eleLength];

        int index = 0 ;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < eleLength; j++) {
                 base[index++]=mat[i][j] ;
            }
        }

        if ((r*c) !=  (length*eleLength)) return  mat;

        int[][] modifiedArray = new int[r][c];

        int pos = 0 ;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                modifiedArray[i][j] = base[pos++];
            }
        }



        return  modifiedArray;
    }
}
