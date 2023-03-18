package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {


        int arr[] = {1,2,2,3,1};
        System.out.println(singleNumber(arr));

    }



    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < nums.length;i++) {
            list.put(nums[i],list.get(nums[i])!=null?list.get(nums[i]) +1 :1);
        }


        for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value==1){
                return  key;
            }
        }

        return  -1;

    }
}

