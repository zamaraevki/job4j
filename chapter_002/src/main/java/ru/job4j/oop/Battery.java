package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery another = new Battery(50);
        System.out.println("battery : " + battery.load + ". another : " + another.load);
        battery.exchange(another);
        System.out.println("battery : " + battery.load + ". another : " + another.load);
        battery.exchange(another);
    }
}
