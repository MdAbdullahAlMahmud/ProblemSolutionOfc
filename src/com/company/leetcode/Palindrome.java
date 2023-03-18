package com.company.leetcode;

public class Palindrome {


    public static void main(String[] args) {

        System.out.println( isPalindrome(-121));

    }


    public static  boolean isPalindrome(int x) {

        String num = String.valueOf(x);
        StringBuilder rev = new StringBuilder();
        rev.append(num);
        String revString = rev.reverse().toString();
        return  revString.equals(num);

    }

}
