package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String args[] ){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Your UserName : ");
        String name=in.nextLine();
        System.out.print("Enter Your Password : ");
        String password=in.nextLine();
        if(!(name.equals("kannan") || password.equals("anbu@123")))
        {
            System.out.println("Wrong UserName and Password");
        }
        else{
            if (name.equals("kannan")||("surya")||("ram") )
            {
                if(password.equals("anbu@123")||("surya321@")("ram@456"))
                {
                else{
                    System.out.println("Wrong Password");
                }
                }
    }
}
