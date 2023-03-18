package com.company.problem_solving;

import java.lang.reflect.Array;
import java.util.HashMap;

public class MinimumNumberOfJumps {

    public static void main(String[] args) {

        int nums [] =  {3,1,3,4,2,4};
       System.out.println( findDuplicate(nums));

    }
//N = 6
//arr = {1, 4, 3, 2, 6, 7}
//Output: 2
    /*public int minJumps(int arr[],int size){

        int currentPosition = 0;
        int step = 0;
        if (arr[currentPosition]<=0){
            return -1;
        }

        step++;
        while ( arr[currentPosition] < arr[size-1] ){

            currentPosition += arr[currentPosition];

            if (currentPosition >= size ){
                return -1;
            }


            if (currentPosition == )
        }



            int secondStartingpoint =0;
        return 0;


    }*/
    public static int findDuplicate(int[] nums) {
        int duplicationValue = 0;
        HashMap<Integer,Integer> list = new HashMap<>();
        list.put(0,5);


        for (int i = 0; i < nums.length; i++) {

            if (list.get(nums[i])==null){
                list.put(nums[i],1);
            }else {
                duplicationValue = nums[i];
            }
        }
        return  duplicationValue;
    }
}
