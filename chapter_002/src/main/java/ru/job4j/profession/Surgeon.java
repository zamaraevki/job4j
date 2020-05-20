package ru.job4j.profession;

public class Surgeon extends Doctor {
    private  String area;

    public Surgeon() {
        super();
    }

    public Surgeon(String name, String surname, String education, int yearbirth, String hospital, String specialization, String area) {
        super(name, surname, education, yearbirth, hospital, specialization);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
