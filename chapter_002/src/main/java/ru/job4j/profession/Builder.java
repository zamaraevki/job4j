package ru.job4j.profession;

public class Builder extends Engineer {
    private String position;

    public Builder() {
        super();
    }

    public Builder(String name, String surname, String education, int yearbirth, String specialization, String organization, String position) {
        super(name, surname, education, yearbirth, specialization, organization);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
