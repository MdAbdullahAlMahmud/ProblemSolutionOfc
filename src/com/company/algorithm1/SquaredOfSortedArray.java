package com.company.algorithm1;

public class SquaredOfSortedArray {


    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};

      /*  for (int i = 0 ;i<arr.length;i++){

            arr[i] = arr[i]*arr[i];
        }

        int sortedArray[] =  sort(arr);
*/
        for (int val :sortedSquares(arr)) {
            System.out.print(val+" , ");
        }


        System.out.println();

    }

    public static int[] sortedSquares(int[] nums) {

        for (int i = 0 ;i<nums.length;i++){

            nums[i] = nums[i] * nums[i];
        }


        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }


        return  nums;



    }



    public static int[] sort(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return  arr;
    }

}
