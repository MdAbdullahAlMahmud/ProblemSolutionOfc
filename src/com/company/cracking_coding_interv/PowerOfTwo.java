package com.company.cracking_coding_interv;

public class PowerOfTwo {

    int powerOf2(int n){
        if (n<1){
            return 0;
        }else  if (n==1){
            System.out.println(1);
            return 1;
        }else {
            System.out.println("calling "+ n);
            int prev = powerOf2(n/2);
            System.out.println("Doing Multiplication of value prev "+ prev);
            int cur = prev*2;
            System.out.println(cur);
            return cur;
        }
    }
}
