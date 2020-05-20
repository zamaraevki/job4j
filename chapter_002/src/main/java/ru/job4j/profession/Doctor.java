package ru.job4j.profession;

public class Doctor extends Profession {

    private String hospital;
    private String specialization;

    public Doctor() {
        super();
    }

    public Doctor(String name, String surname, String education, int yearbirth, String hospital, String specialization) {
        super(name, surname, education, yearbirth);
        this.hospital = hospital;
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
