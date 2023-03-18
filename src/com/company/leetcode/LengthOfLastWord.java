package com.company.leetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {



        System.out.println("Result "+ lengthOfLastWord1("aaa   a asdf   "));
    }


    public static int lengthOfLastWord(String s) {
        String modifiedString = s.trim();
        int count = 0;
        for (int i = modifiedString.length()-1; i >= 0; i--) {
            if (modifiedString.charAt(i)==' '){
                return  count;
            }else {
                count++;
            }
        }
        return count;
    }

    public static int lengthOfLastWord1(String s) {
        int count = 0;
        int spaceLen = 0;
        int i = s.length()-1;

        while (i>=0){
            if (s.charAt(i) ==' '){
                i--;
                spaceLen ++;
            }else {
                break;
            }
        }


        int wSpace = s.length()-1 - spaceLen;

        while (wSpace>=0){
            if (s.charAt(wSpace) == ' '){
                break;
            }else {
                count ++;
                wSpace--;
            }
        }


        return count;
    }






}
