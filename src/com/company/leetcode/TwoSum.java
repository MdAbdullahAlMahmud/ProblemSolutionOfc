package com.company.leetcode;

import java.util.HashMap;

public class TwoSum {



    public static void main(String[] args) {

        int arr[] ={3,2,4};
        int target = 6;
        int ans [] = twoSum2(arr,target);
        System.out.println(ans[0]+" " + ans[1]);
    }


    public static  int[] twoSum(int[] nums, int target) {

        //Time Complexity O(n^2)
        int arr[] = new  int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return  arr;

                }
            }
        }

        return  arr;



    }

      public static  int[] twoSum2(int[] nums, int target) {
          //Time Complexity O(n)

        int arr[] = new  int[2];


          HashMap<Integer , Integer > resultMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

           if(resultMap.get(target - nums[i]) !=null){

               arr[0] = i;
               arr[1] = resultMap.get(target - nums[i]);
               return  arr;

           }else {
               resultMap.putIfAbsent(nums[i],i);
           }

        }

        return  arr;



    }






}
