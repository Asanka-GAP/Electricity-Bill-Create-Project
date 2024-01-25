package com.company;

public class DisplayCustomer extends Adminsub {
    DisplayCustomer(){
        for(Customer cu:customerList){
            System.out.println("* Account NO:"+cu.getAccount());
            System.out.println("* Customer Name:"+cu.getName());
            System.out.println("* Address:"+ cu.getAddress());
            System.out.println("* Number of Units:"+cu.getNou());
            System.out.println("* Bill to pay: Rs."+cu.getBilltopay());
            System.out.println("-------------------------------------");
        }
    }
}
