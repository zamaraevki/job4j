package ru.job4j.profession;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int yearbirth;

    public Profession() {
        super();
    }

    public Profession(String name, String surname, String education, int yearbirth) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.yearbirth = yearbirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getYearbirth() {
        return yearbirth;
    }
}
