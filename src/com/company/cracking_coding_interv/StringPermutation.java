package com.company.cracking_coding_interv;

public class StringPermutation {

    public static void main(String[] args) {
        String str = "Abdullah";
        //permutation(str, "");

     System.out.println("Fibo  " + fibo(5));
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        powerOfTwo.powerOf2(20);

    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }


    static  int fibo(int n){
        if (n<=0) return 0;
        else if (n==1) return  1;
        return fibo(n-1)+fibo(n-2);
    }

}

