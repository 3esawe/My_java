package Udemy_Autoboxing;

public class main {
    public static void main(String[] args) {

        Bank b = new Bank();
        b.AddBranch(new Branch("Manama") ,"omar",200);
        b.addTransaction(new Branch("Manama") , 500 , "omar");
        b.print();



    }

}
