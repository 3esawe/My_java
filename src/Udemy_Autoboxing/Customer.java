package Udemy_Autoboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> doubleArrayList ;

    public Customer(String name, double x) {
        this.name = name;
        this.doubleArrayList =  new ArrayList<>();
        addTransaction(x);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getDoubleArrayList() {
        return doubleArrayList;
    }
    public void addTransaction(double amount) {
        double x =+ amount;
        this.doubleArrayList.add(x);
    }


}
