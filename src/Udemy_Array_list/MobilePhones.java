package Udemy_Array_list;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MobilePhones {
    static ArrayList<Contacts> mobilephones = new ArrayList<>();
    public void addContact(Contacts contacts){
        mobilephones.add(contacts);
    }
    private int find (String old){
        for(int i=0 ; i < mobilephones.size() ; i++ ){
            Contacts contacts = mobilephones.get(i);
            if (contacts.getName().equals(old)){
                return i;
            }

        }
        return -1;

    }
    private int findContact(Contacts contacts){
        return mobilephones.indexOf(contacts);
    }
    public boolean modify(Contacts old , Contacts newContact){
        int pos = find(old.getName());
        if(pos < 0){
            System.out.println(old.getName() +", was not found.");
            return false;
        }
        else if (pos != -1){
            System.out.println(", is  already exist " + newContact.getName());
            return false;
        }
        mobilephones.set(pos, newContact);
        System.out.println(old.getName() + ", was replaced with " + newContact.getName());
        return true;
    }
    public boolean remove(Contacts contact){
        int pos = findContact(contact);
        if(pos < 0){
            System.out.println(contact.getName() +", was not found.");
            return false;
        }
        System.out.println(contact.getName() + ", was removed" );
        mobilephones.remove(contact);
        return true;
    }
    public void printContacts(){

        Iterator <Contacts> contactsListIterator = mobilephones.listIterator();
        while (contactsListIterator.hasNext()){
            System.out.println("Name: " + contactsListIterator.next().getName());
        }

    }


    public static void SortByName(){
        Collections.sort(mobilephones, new Comparator<Contacts>() {
            @Override
            public int compare(Contacts o1, Contacts o2) {

                return o1.getName().compareToIgnoreCase(o2.getName()) ;

            }

        });


    }

//    public String queryContact(Contacts contact) {
//        if(find(contact) >=0) {
//            return contact.getName();
//        }
//        return null;
//    }
    public Contacts queryContact(String name ) {
        int position = find(name);
        if(position >=0) {
            return this.mobilephones.get(position);
        }

        return null;
    }
//
//    private int findContact(String contactName) {
//        for(int i=0; i<this.mobilephones.size(); i++) {
//            Contacts contact = this.mobilephones.get(i);
//            if(contact.getName().equals(contactName)) {
//                return i;
//            }
//        }
//        return -1;
//    }


}
