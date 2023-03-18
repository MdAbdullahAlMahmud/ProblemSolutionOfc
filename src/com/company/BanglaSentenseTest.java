package com.company;

public class BanglaSentenseTest {


    public static void main(String[] args) {
        String word ="I puck your system";
        String bnWord ="আমি তোমার সিস্টেম কে *** না  " + word;

        String sen = "আমি";


        for (int i = 0; i < sen.length(); i++) {
            System.out.println(sen.charAt(i));
        }

        System.out.println("####################################");

        System.out.println(sen.length());


        System.out.println("\\u0986\\u09ae ");
    String mango = "\u0049 am \u0986 \u09ae ";

        System.out.println("Ans ---------------------->   " + mango);
        for (int i = 0; i < word.length(); i++) {

            System.out.println(word.charAt(i) +" -> "+(int)word.charAt(i)   + " -------> "+ getUnicodeCharacterOfChar(word.charAt(i)));
        }

        for (int i = 0; i < bnWord.length(); i++) {

            int asciVal = (int) bnWord.charAt(i);
            boolean status =  asciVal > 1000;

           System.out.println(bnWord.charAt(i) +" -> "+(int)bnWord.charAt(i) + " unicode ---> "+getUnicodeCharacterOfChar(bnWord.charAt(i)));

        }
    }
    private static String getUnicodeCharacterOfChar(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}
