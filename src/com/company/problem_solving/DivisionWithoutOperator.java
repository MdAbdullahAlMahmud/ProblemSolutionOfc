package com.company.problem_solving;

public class DivisionWithoutOperator {
    public static void main(String[] args) {

        int n = 31 , di = 5 ;
        int ans = output(n,di,1);

        System.out.println("Ans " + output(31,5,1));

        int a =2, b= 5;
        System.out.println( a+" ^ "+b + " = "+power(a,b) );

    }


    public static int  output(int n , int di, int index ){

        if (di*index == n ) return  index;
        else  if (di*index >n )return  index-1;

        else  return  output(n,di,++index);

    }


    public static  int aPowerB(int a , int b){

        if (b==0) return 1;

        else if (a%2==1) return  a * aPowerB(a,b-1);
        else {
            int temp = aPowerB(a,b/2);
            return  temp * temp;
        }
    }


    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base, powerRaised - 1));
        }
        else {
            return 1;
        }
    }

}
