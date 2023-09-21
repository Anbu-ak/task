package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("enter your number");
        int num= in.nextInt();
       if (num%3==0)  {
            System.out.println("divisible by 3 odd number");
        }
        else if (num % 2 == 0)
        {
            System.out.println("even number");
        }

        else {
            System.out.println("odd number");
        }








    }
}
