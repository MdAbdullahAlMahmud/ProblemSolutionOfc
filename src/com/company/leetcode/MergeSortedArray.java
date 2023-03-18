package com.company.leetcode;

public class MergeSortedArray {

    public static void main(String[] args) {

    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int arr[] = new int[m+n];

        int P1 = 0 ,P2 = 0;
        int index = 0 ;
        while (index < m+n){

            if (P1 < m && P2 <n && nums1[P1]<nums2[P2]){
                arr[index] = nums1[P1];
                P1++;
            }

        }

    }

}
