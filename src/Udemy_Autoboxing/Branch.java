package Udemy_Autoboxing;

import Udemy_Array_list.Contacts;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public String getName() {
        return name;
    }

    public boolean addCustomer (Customer customer){
        int pos = find(customer);
        if (pos >= 0){
            System.out.println("Contact Exist");
            return false;
        }
        customerArrayList.add(customer);
        return true;

    }

    private int find (Customer customer){
        return customerArrayList.indexOf(customer);
    }
    public boolean addTran (Customer customer, double x){
        int pos = find(customer);
        if (pos < 0 ){
            System.out.println("Contact was not found");
            return false;
        }

        customer.addTransaction(x);

        return true;

    }
    private int find (String old){
        for(int i=0 ; i < customerArrayList.size() ; i++ ){
            Customer contacts = customerArrayList.get(i);
            if (contacts.getName().equals(old)){
                return i;
            }

        }
        return -1;

    }

    public void print(){
        for (int i = 0 ; i < customerArrayList.size(); i++){
            System.out.println("Customer Name: " + customerArrayList.get(i).getName() + " \namount of money: " + customerArrayList.get(i).getDoubleArrayList().get(i));
        }
    }
}
