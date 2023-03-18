package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTWoArray {

    public static void main(String[] args) {

        int num1[] = {1,1,2,2,3,3,3};
        int num2[] = {1,2,2,3,3};

       int ans [] =  intersect(num1,num2);

        for (int a : ans) {
            System.out.print(" " + a);
        }


    }

    public static int[] WrongIntersect(int[] nums1, int[] nums2) {

        int num1Min = nums1[0];
        int num2Min = nums2[0];

        int num1Max = nums1[0];
        int num2Max = nums2[0];

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < num1Min) num1Min = nums1[i];
            if (nums1[i] > num1Max) num1Max= nums1[i];
        }


        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < num2Min) num2Min = nums2[i];
            if (nums2[i] > num2Max) num2Max= nums2[i];
        }

        int arr[] = new int[2];

        arr[0] = Math.min(num1Min,num2Min);
        arr[1] = Math.max(num1Max,num2Max);

        return  arr;


    }

    public  static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer , Integer > map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],map.get(nums1[i])!=null ? 1+map.get(nums1[i] ) : 1);
        }


        ArrayList<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(map.get(nums2[i])!=null && map.get(nums2[i]) > 0 ){
                numsList.add(nums2[i]);
                map.put(nums2[i] ,map.get(nums2[i]) -1);
            }
        }

        int arr[] =  new int[numsList.size()];
        int index = 0 ;
        for (int a : numsList) {
            arr[index] = a;
            index ++;
        }

        return  arr;

    }

}
