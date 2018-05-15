package Udemy_Autoboxing;

import Udemy_Array_list.Contacts;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchArrayList = new ArrayList<>();
    public boolean AddBranch(Branch branch ,String x , double y){
        int pos = findContact(branch);
        if (pos >= 0){
            System.out.println("Branch Exist");
            return false;
        }
        branch.addCustomer(new Customer(x,y));
        branchArrayList.add(branch);
        return true;    }
    public boolean addTransaction (Branch branch, double x,String  customer){
        int pos = find(branch.getName());
        if (pos < 0 ){
            System.out.println("Branch was not found");
            return false;
        }

        branch.addTran(new Customer(customer , x ) , x);
        System.out.println("amount of: " + x + " was added successfully");
        return true;

    }
    private int find (String old){
        for(int i=0 ; i < branchArrayList.size() ; i++ ){
            Branch branch = branchArrayList.get(i);
            if (branch.getName().equals(old)){
                return i;
            }

        }
        return -1;

    }
    private int findContact(Branch branch){
        return branchArrayList.indexOf(branch);
    }
    public void print(){
        for (int i = 0 ; i < branchArrayList.size(); i++){
            System.out.println("Branch Name: " + branchArrayList.get(i).getName() + " \nCustomer Name: " + branchArrayList.get(i).getCustomerArrayList().get(i).getName() +" \nthe intial money amount: "+  branchArrayList.get(i).getCustomerArrayList().get(i).getDoubleArrayList().get(i));
        }
    }
}
