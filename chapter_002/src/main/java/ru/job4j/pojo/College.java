package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Zamaraev Konstantin Igorevich");
        student1.setGroup("Tk-08-2");
        student1.setReceipt(new Date());

        System.out.println("student - " + student1.getName() + System.lineSeparator() +
                            "group - " + student1.getGroup() + System.lineSeparator() +
                            "receipt - "+ student1.getReceipt());
    }
}
