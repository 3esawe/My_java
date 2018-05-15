package Udemy_Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    private String name;
    private int ID;

    public Player(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public List<String> write() {
        List<String > x =new ArrayList<>();
        x.add(0,this.name);
        x.add(1,"" +this.ID);
        return x;
    }

    @Override
    public void read(List<String> x) {

    }
}
