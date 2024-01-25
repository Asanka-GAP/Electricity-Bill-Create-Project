package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {


       public static void main(String[] args) {
           Scanner obj1=new Scanner(System.in);

           System.out.println("-----------------------------------------------------------------");
           System.out.println("-------WELCOME TO OUR ELECTRICITY BILL CALCULATING SYSTEM--------");
           System.out.println("------------Are you an Admin or a Customer..?--------------------");
           System.out.println("-----------------------------------------------------------------");
           System.out.println("1. Admin");
           System.out.println("2. Customer");
           System.out.println("0. Exit");
           System.out.print("Enter your choice: ");
           int choice=obj1.nextInt();

        do {
            if (choice == 1) {
                Admin obj5 = new Admin();
                obj5.login();
            } else if (choice == 2) {
                Customer obj6 = new Customer();
                obj6.log();
            }
        }while(choice!=0);
       }

       
}

