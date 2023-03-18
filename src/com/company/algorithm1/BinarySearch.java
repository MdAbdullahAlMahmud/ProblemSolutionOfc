package com.company.algorithm1;

public class BinarySearch {

    public static void main(String[] args) {
       int  nums[] = {5};
       int target = 5;
        System.out.println( search(nums,target));

    }
    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int mid;

        while (low<=high){

            mid = low + (high - low) / 2;
            if (nums[mid] == target){
                return  mid;
            }
             else  if (target>nums[mid]){
                low  = mid +1;
            }
             else {
                high = mid -1;
            }

        }


        return -1;

    }

}
