package com.company.leetcode;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumberDisappeared {


    public static void main(String[] args) {
        int arr [] = {4,3,2,7,8,2,3,1};


        findDisappearedNumbersV2(arr).forEach(integer -> {
            System.out.print( integer+" ");
        });

    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappearednumber = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            boolean contains = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]){
                    contains = true;
                    break;
                }
            }
            if (!contains)disappearednumber.add(i);
        }
        return  disappearednumber;
    }

    public static List<Integer> findDisappearedNumbersV2(int[] nums) {

        List<Integer> disappearednumber = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i],nums[i]);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)){
                disappearednumber.add(i);
            }
        }

        return  disappearednumber;
    }






    private  void  mapTest(){

        int arr[] = {1,2,3,4,5};

        int target = 3 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target ){
                System.out.println("Found");
            }
        }


        HashMap<Integer , Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashmap.put(arr[i],arr[i]);
        }


        System.out.println(hashmap.containsKey(3));






    }




}
