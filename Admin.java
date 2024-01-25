package com.company;

import java.util.Scanner;

public class Admin {

    public void login() {

        Scanner ob4 = new Scanner(System.in);

        System.out.println("Enter your Admin ID:");
        int a = ob4.nextInt();
        System.out.println("Enter your password:");
        int b = ob4.nextInt();
        Adminsub obj8=new Adminsub();

        if ((a == 2019046) && (b == 2019046)) {
            obj8.mng();
        }
        else if ((a == 2019124) && (b == 2019124)) {
            obj8.mng();

        }
        else if ((a == 2019228) && (b == 2019228)) {
            obj8.mng();
        }
        else if ((a == 20190064) && (b == 2019064)) {
            obj8.mng();
        }
        else if ((a == 2019192) && (b == 2019192)) {
            obj8.mng();
        }
        else {
            System.out.println("Incorrect Admin ID or Password..!!!");
        }

    }
}
