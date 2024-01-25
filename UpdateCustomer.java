package com.company;

import java.util.Scanner;

public class UpdateCustomer extends Adminsub{
    public void updateCustomer(int update){
        Scanner xx=new Scanner(System.in);
        boolean serch=true;
        for (Adminsub.Customer cu:customerList){
            if(cu.getAccount()==update){
                System.out.println("Enter new name:");
                String name= xx.nextLine();
                cu.setName(name);
                System.out.println("Enter new address:");
                String address= xx.nextLine();
                cu.setAddress(address);
                System.out.println("Enter new Number of Units:");
                int nn= xx.nextInt();
                cu.setNou(nn);
                mng(nn);
                cu.setBilltopay(mng(nn));
                System.out.println("Bill to pay = Rs."+cu.getBilltopay());
                serch=false;



            }
        }
        if (serch) {
            System.out.println(update + " Not exist !!");
        }
    }
}
