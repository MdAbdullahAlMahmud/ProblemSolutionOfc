package com.company.leetcode;

public class MissingNumber {

    public static void main(String[] args) {
        int arr[] = {3,0,1};


        System.out.println("Diff  " + missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
        }
        int nSum = (n*(n+1))/2;
        return  nSum -sum;
    }
}
