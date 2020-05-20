package ru.job4j.profession;

public class Programmer extends Engineer {
    private String language;

    public Programmer() {
        super();
    }

    public Programmer(String name, String surname, String education, int yearbirth, String specialization, String organization, String language) {
        super(name, surname, education, yearbirth, specialization, organization);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
