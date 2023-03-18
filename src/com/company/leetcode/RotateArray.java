package com.company.leetcode;

public class RotateArray {


    public static void main(String[] args) {

        int arr[] = {-1,-100,3,99};

        rotate(arr,2);
    }

    public static void rotate(int[] nums, int k) {
        int arr[] = new int[nums.length];
        int arrLength = nums.length;

        if (arrLength<k)k = arrLength;

        int index = 0;
        for (int i = arrLength-k; i <arrLength; i++) {
            arr[index] = nums[i];
            index++;
        }

        for (int i = 0; i < arrLength-k; i++) {
            arr[index] = nums[i];
            index++;

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i] + " ");
        }
    }

}
