package com.company.leetcode;

import com.company.gfg.MaximumProductSub;

import java.util.HashMap;

public class LongestSubstringwithoutRepeating {


    public static void main(String[] args) {

        //String word = "bbbbb";
        String word = "dvdf";

        System.out.println( "length " + lengthOfLongestSubstring(word));


         int a = 5;
        a=10;

        final int x = twoSum(4,5);

    }
    public static int twoSum(int a, int b ){return  a+b;}

    public static int lengthOfLongestSubstring(String s) {

        int maxlength = 0;
        HashMap<Character, Character> characterHashMap = new HashMap<>();

        int count = 0;


        int i;
        for (i = 0; i < s.length(); i++) {


        if (characterHashMap.get(s.charAt(i)) == null) {
            characterHashMap.put(s.charAt(i), s.charAt(i));
            count++;
        } else {
            maxlength = Math.max(count, maxlength);
            count = 0;
            characterHashMap.clear();
            characterHashMap.put(s.charAt(i), s.charAt(i));
        }
        }

        return  Math.max(count,maxlength);
    }
    public static int lengthOfLongestSubstringV2(String s) {

        int maxlength = 0;
        HashMap<Character, Character> characterHashMap = new HashMap<>();

        int count = 0;


        int i = 0;
        while (i<s.length()){
            if (characterHashMap.get(s.charAt(i)) == null) {
                characterHashMap.put(s.charAt(i), s.charAt(i));
                count++;
                i++;
            } else {
                maxlength = Math.max(count, maxlength);
                count = 0;
                characterHashMap.clear();
               i--;
            }

        }

        return  Math.max(count,maxlength);
    }

}
