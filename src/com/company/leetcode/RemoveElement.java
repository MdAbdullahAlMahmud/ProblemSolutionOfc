package com.company.leetcode;

public class RemoveElement {

    public static void main(String[] args) {

        int arr[] = {3,2,2,3};
        System.out.println("Count "+removeElement(arr,3));
    }


    public static  int removeElement(int[] nums, int val) {

        int count = 0;
        int arr [] = new int[nums.length];
        int index = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                count++;
            }else {
                arr[index] = nums[i];
                index ++;
            }
        }
        nums = arr;

        for (int n : nums
             ) {
            System.out.print( " " + n);
        }
        return  nums.length - count;


    }

}
