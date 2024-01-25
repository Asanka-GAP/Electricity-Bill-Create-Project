package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Adminsub {

    public static ArrayList<Customer> customerList = new ArrayList<Customer>();

    public void mng() {

        Scanner n = new Scanner(System.in);
        int reapeat = 5;
        while (reapeat > 0) {
            System.out.println("------------------------------------------------------");
            System.out.println("-------------------HI THERE..!!!----------------------");
            System.out.println("------------------------------------------------------");
            System.out.println("----------Please choose one of below Options----------");
            System.out.println("1. Add Customer");
            System.out.println("2. Display All Customers");
            System.out.println("3. Search Customers");
            System.out.println("4. Update Customer details");
            System.out.println("5. Delete Customer");
            System.out.println("6. Exit");
            System.out.print("your choice: ");
            int option = n.nextInt();
            System.out.println("------------------------------------------------------");

            switch (option) {
                case 1:
                    System.out.println("Enter Customer account NO:");
                    int ac = n.nextInt();
                    boolean chekId = checkCustomerId(ac);
                    if (chekId) {
                        System.out.println("This Account is Already Exist");
                        break;
                    }
                    n.nextLine();
                    System.out.println("Enter Customer name:");
                    String name = n.nextLine();
                    System.out.println("Enter Customer address:");
                    String addr = n.nextLine();
                    System.out.println("Enter number of units:");
                    int unit = n.nextInt();
                    mng(unit);
                    System.out.println("Bill to pay = Rs."+mng(unit));
                    Customer s = new Customer(ac, name, addr, unit,mng(unit));
                    customerList.add(s);
                    break;

                case 2:
                    DisplayCustomer obj3=new DisplayCustomer();
                    break;

                case 3:
                    System.out.println("Please Enter customer account NO, you want to Search");
                    int id = n.nextInt();
                    //searchCustomer(searchCustomerId);
                    SearchCustomer obj4=new SearchCustomer(id);
                    break;
                case 4:
                    System.out.println("Please Enter customer account NO,you want to update");
                    int update=n.nextInt();
                    UpdateCustomer obj=new UpdateCustomer();
                    obj.updateCustomer(update);
                    break;
                case 5:
                    System.out.println("Please Enter customer account NO,you want to Delete");
                    int delete=n.nextInt();
                    DeleteCustomer obj2=new DeleteCustomer();
                    obj2.deleteCustomer(delete);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }
    }

    public boolean checkCustomerId(int ac) {
        for (Customer st : customerList) {
            if (st.getAccount() == ac) {
                return true;
            }
        }
        return false;

    }

   public static class Customer {
        private int a;
        private String b;
        private String c;
        private int d;
        private double e;



        public Customer(int a,String b,String c,int d,double e){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
            this.e=e;
        }

       public int getAccount() {
            return a;
        }
        public String getName() {
            return b;
        }
        public String getAddress() {
            return c;
        }
        public int getNou() {
            return d;
        }
        public double getBilltopay() {
            return e;
        }

        public void setName(String name){
            this.b=name;
        }
        public void setAddress(String add){
            this.c=add;
        }
        public void setNou(int nou){
            this.d=nou;
        }
        public void setBilltopay(double bill){
            this.e=bill;
        }

        public String toString(){
            return a+" "+b+" "+c+" "+d+" "+e;
        }


   }
    public double mng(int unit){
        double answer = 0.0;

        if (unit <= 60) {
            answer = unit * 8;
        } else if (61 <= unit && unit <= 90) {
            answer = 60 * 7.85 + (unit - 60) * 10;
        } else if (91 <= unit && unit <= 120) {
            answer = (60 * 7.85) + (30 * 10) + ((unit - 90) * 27.75);
        } else if (121 <= unit) {
            answer = (60 * 7.85) + (30 * 10) + (30 * 27.75) + ((unit - 120) * 32);
        }
        return answer;
    }
}