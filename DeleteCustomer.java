package com.company;

public class DeleteCustomer extends Adminsub {

    public void deleteCustomer(int ac){
        boolean found=false;
        Adminsub.Customer cusdel=null;
        for (Adminsub.Customer cu:customerList){
            if(cu.getAccount()==ac){
                cusdel=cu;
                found=true;
            }
        }
        if (!found){
            System.out.println("Customer is not exist");
        }
        else {
            customerList.remove(cusdel);
            System.out.println("Customer deleted successfully");
        }
    }
}
