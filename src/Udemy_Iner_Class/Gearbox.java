package Udemy_Iner_Class;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears ;
    private int maxGears;
    private int currGear;
    private boolean Cluth =true;

    public void addGear(int num, int cluth){
        if ((num > 0 && num <= maxGears) ){
            gears.add(new Gear(num , cluth));
        }
    }
    public void changeGear(int newGear){
        if ((newGear>=0)&& (newGear<=gears.size())&& Cluth){
            this.currGear = newGear;
            System.out.println("new Gear is slected: " + newGear);
        }
        else System.out.println("funk you");
    }
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear nu = new Gear(0 , 0);
        for(int i= 0; i < maxGears;i++){
            addGear(i,i*5);
        }
    }



























    private class Gear{
        private int gearnum;
        private int ratio;

        public Gear(int gearnum, int ratio) {
            this.gearnum = gearnum;
            this.ratio = ratio;
        }

        public int getGearnum() {
            return gearnum;
        }

        public void setGearnum(int gearnum) {
            this.gearnum = gearnum;
        }

        public int getRatio() {
            return ratio;
        }

        public void setRatio(int ratio) {
            this.ratio = ratio;
        }
    }

}
