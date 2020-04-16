package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load - 5;
        another.load = another.load + 5;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery another = new Battery(0);
        System.out.println("battery : " + battery.load + ". another : " + another.load);
        battery.exchange(another);
        System.out.println("battery : " + battery.load + ". another : " + another.load);
        battery.exchange(another);
        System.out.println("battery : " + battery.load + ". another : " + another.load);
        battery.exchange(another);
        System.out.println("battery : " + battery.load + ". another : " + another.load);
    }
}
