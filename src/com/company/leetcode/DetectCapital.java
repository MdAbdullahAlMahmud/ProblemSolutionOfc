package com.company.leetcode;

public class DetectCapital {


    public static void main(String[] args) {

        System.out.println("Ans "+ detectCapitalUse("GAoogle"));
    }


    public static boolean detectCapitalUse(String word) {


        boolean isAllCapsValid = false;
        boolean isAllLowerCapsValid = false;
        boolean isFirstCapsUpper = false;
        boolean isFirstCapsUpperFirstElement = false;
        for (int i = 0; i < word.length(); i++) {
            if ((int)word.charAt(i) >=65  && (int)word.charAt(i) <= 90){

                if (i==0)isFirstCapsUpperFirstElement = true;
                isAllCapsValid =true;
            }else {
                isAllCapsValid =false;
            }


            if ((int)word.charAt(i) >=97  && (int)word.charAt(i) <= 122){

                isAllLowerCapsValid =true;
            }else {
                isAllLowerCapsValid =false;
            }

             if (isFirstCapsUpperFirstElement && (int)word.charAt(i) >=97  && (int)word.charAt(i) <= 122){

                 isFirstCapsUpper =true;
            }else {
                 isFirstCapsUpper =false;
             }

        }



        return isAllCapsValid || isAllLowerCapsValid || isFirstCapsUpper;

    }


}
