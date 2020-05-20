package ru.job4j.profession;

public class Dentist extends Doctor {
    private String position;

    public Dentist() {
        super();
    }

    public Dentist(String name, String surname, String education, int yearbirth, String hospital, String specialization, String position) {
        super(name, surname, education, yearbirth, hospital, specialization);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
