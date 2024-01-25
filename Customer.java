package com.company;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Customer extends Adminsub {

    public void log(){

        int re=1;
        Scanner obj7=new Scanner(System.in);
        Scanner ob=new Scanner(System.in);
        Scanner obb=new Scanner(System.in);
        System.out.println("Enter your account number:");
        int c=obj7.nextInt();
        System.out.println("Enter your Name:");
        String n=ob.nextLine();
        System.out.println("Enter your address:");
        String m=obb.nextLine();
        System.out.println("Enter your units for this month:");
        int unit=obj7.nextInt();
        mng(unit);
        System.out.println("Bill to pay = Rs."+mng(unit));

        Scanner p=new Scanner(System.in);
        Scanner o=new Scanner(System.in);

        while (re>0) {
            System.out.println("1.To pay online:");
            System.out.println("2.To take a printout of bill:");
            System.out.println("3.Exit");
            int ch = p.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter your debit or credit card NO:");
                    int d = p.nextInt();
                    System.out.println("Enter card expiration date:");
                    String v = o.nextLine();
                    System.out.println("Number of units for this month:"+unit);
                    System.out.println("You should pay = Rs."+mng(unit));
                    in(c, n, m, unit, mng(unit));
                    System.out.println("PAYED SUCCESSFULLY !!!");
                    break;
                case 2:
                    in(c, n, m, unit, mng(unit));
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }
    public void in(int a,String l,String k,int g,double p){
        LocalDate myDateObj = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("-----------------------------------------");
        System.out.println("Date:"+" "+formattedDate);
        System.out.println("-----------------------------------------");
        System.out.println("Account Number  :"+" "+a);
        System.out.println("Your Name       :"+" "+l);
        System.out.println("Address         :"+" "+k);
        System.out.println("Number of Units :"+" "+g);
        System.out.println("-----------------------------------------");
        System.out.println("Bill to pay     :"+" "+p);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("     THANK YOU FOR VISITING US !!!");
        System.out.println("-----------------------------------------");
    }
}
