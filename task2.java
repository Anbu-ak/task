package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the person's age");
        int num= in.nextInt();

        if (num == 30)
        {
            System.out.println("kumar age");
            System.out.println("younger brother");
        }
        else if(num==40) {
            System.out.println("ram age");
            System.out.println("middle age brother");
        }
        else if(num==50) {
            System.out.println("murugan age");
            System.out.println("elder brother");
        }
        else{
            System.out.println("invalid input");
        }

    }
}