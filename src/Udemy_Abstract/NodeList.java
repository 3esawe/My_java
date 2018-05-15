package Udemy_Abstract;

import java.util.List;

public interface NodeList {
    Listitem getrRoot();
    boolean addItem(Listitem listitem);
    boolean removeItem(Listitem listitem);
    void print(Listitem root);
}
