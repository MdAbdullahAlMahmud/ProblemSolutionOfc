package com.company.leetcode;

public class HalvesLike {



    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));


    }


    public  static  boolean halvesAreAlike(String s) {

        int sLength = s.length();

        int firstPortion = 0;
        int lastPortion = 0;

        for (int i = 0; i < sLength/2; i++) {
            String charecter = String.valueOf(s.charAt(i));
            if (charecter.toLowerCase().equals("a") || charecter.toLowerCase().equals("e") || charecter.toLowerCase().equals("i") || (charecter.toLowerCase().equals("o") || charecter.toLowerCase().equals("u"))
            ) {
                firstPortion +=1;
            }
        }
         for (int i = ((sLength/2)); i < sLength; i++) {

             String charecter = String.valueOf(s.charAt(i));
             if (charecter.toLowerCase().equals("a") || charecter.toLowerCase().equals("e") || charecter.toLowerCase().equals("i") || (charecter.toLowerCase().equals("o") || charecter.toLowerCase().equals("u"))) {
                 lastPortion +=1;
             }

        }

        return  lastPortion == firstPortion;


    }


}
