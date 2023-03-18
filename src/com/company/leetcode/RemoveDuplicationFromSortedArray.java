package com.company.leetcode;

import java.util.HashMap;

public class RemoveDuplicationFromSortedArray {

    public static void main(String[] args) {

        int arr[] = {1,1,2};
        System.out.println("Size " +removeDuplicates(arr) );

    }

    public  static int removeDuplicates(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i],1);
        }


        map.entrySet().forEach(action->{

            System.out.println(action.getKey() +" -> "+ action.getValue());
        });



        return  map.size();

    }
}
