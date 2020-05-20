package ru.job4j.profession;

public class Engineer extends Profession {
    private String organization;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String education, int yearbirth, String specialization, String organization) {
        super(name, surname, education, yearbirth);
        this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
