package com.company;

public class SearchCustomer extends Adminsub {
    SearchCustomer(int searchCustomerId){
        boolean search = true;
        for (Adminsub.Customer st : customerList) {
            if (st.getAccount() == searchCustomerId) {
                System.out.println("* Customer Account NO: " + st.getAccount());
                System.out.println("* Customer name: " + st.getName());
                System.out.println("* Address: " + st.getAddress());
                System.out.println("* Number of unit: " + st.getNou());
                System.out.println("* Bill to pay: Rs." + st.getBilltopay());
                search = false;
            }
        }
        if (search) {
            System.out.println(searchCustomerId + " Not exist");
        }
    }
}
