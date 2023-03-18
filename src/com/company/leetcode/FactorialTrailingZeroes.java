package com.company.leetcode;

public class FactorialTrailingZeroes {



    public static void main(String[] args) {


        int n = 333 ;
      //  System.out.println("Trailing Zero " + trailingZeroes(n));
        System.out.println("Trailing Zero V2 " + trailingZeroesV2(n));
        System.out.println("Trailing Zero V3 " + trailingZeroesV3(n));

    }


    public static int trailingZeroes(int n) {

        int trailingZero = n/5;
        return  trailingZero;
    }

     public static int trailingZeroesV2(int n) {

        int count = 0;
         for (int i = 5; n / i >= 1; i *= 5)
             count += n / i;

         return count;
    }


    public static int trailingZeroesV3(int n) {

        //Time Complexity Log 5 base N

        // We have divided the number by 5 until the Quotient greater than 5 . At the end sum all the  Quotient
        int count = 0;

        while (n/5 >= 5){
            int vf = (n/5);
            count += vf;
            n = n/5;
        }
        count+=(n/5);
         return count;

    }






}
